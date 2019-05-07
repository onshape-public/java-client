/*
 * The MIT License
 *
 * Copyright 2019 Onshape Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.onshape.api.base;

import com.onshape.api.exceptions.OnshapeException;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;

/**
 * Utility class for polling GET methods
 *
 * @author Peter Harman peter.harman@cae.tech
 */
public class PollingHandler {

    private final BaseClient client;
    private final ScheduledExecutorService executorService;
    private int initialDelay;
    private int maximumDelay;
    private int maximumCalls;

    PollingHandler(BaseClient client) {
        this.client = client;
        this.executorService = Executors.newScheduledThreadPool(1);
        this.initialDelay = 1;
        this.maximumDelay = 10;
        this.maximumCalls = 50;
    }

    /**
     * Gets the initial delay in seconds used for polling methods.
     *
     * @return Initial delay in seconds
     */
    public int getInitialDelay() {
        return initialDelay;
    }

    /**
     * Sets the initial delay in seconds used for polling methods.
     *
     * @param initialDelay Initial delay in seconds
     */
    public void setInitialDelay(int initialDelay) {
        this.initialDelay = initialDelay;
    }

    /**
     * Gets the maximum delay in seconds used for polling methods.
     *
     * @return Maximum delay in seconds
     */
    public int getMaximumDelay() {
        return maximumDelay;
    }

    /**
     * Sets the maximum delay in seconds used for polling methods.
     *
     * @param maximumDelay Maximum delay in seconds
     */
    public void setMaximumDelay(int maximumDelay) {
        this.maximumDelay = maximumDelay;
    }

    /**
     * Gets the maximum number of sequential calls for a single method.
     *
     * @return Maximum number of calls
     */
    public int getMaximumCalls() {
        return maximumCalls;
    }

    /**
     * Sets the maximum number of sequential calls for a single method.
     *
     * @param maximumCalls Maximum number of calls
     */
    public void setMaximumCalls(int maximumCalls) {
        this.maximumCalls = maximumCalls;
    }

    /**
     * Request the given URL until the predicate is satisfied on the response
     * object. Returns a CompletableFuture that supports blocking, cancellation
     * or concurrent usage.
     *
     * @param <T> The response type
     * @param href The URL
     * @param responseType Class object of response type
     * @param until Predicate to be satisfied
     * @return A CompletableFuture of the response
     */
    public <T> CompletableFuture<T> poll(String href, Class<T> responseType, Predicate<T> until) {
        CompletableFuture<T> future = new CompletableFuture<>();
        poll(href, responseType, until, future, initialDelay, 0);
        return future;
    }

    private <T> void poll(String href, Class<T> responseType, Predicate<T> until, CompletableFuture<T> future, int delay, int count) {
        this.executorService.schedule(() -> {
            if (!future.isCancelled()) {
                try {
                    // Call the HTTP GET method
                    T response = client.call("GET", href, null, new HashMap<>(), new HashMap<>(), responseType);
                    // Test the predicate
                    if (until.test(response)) {
                        future.complete(response);
                    } else {
                        if (count >= maximumCalls) {
                            future.completeExceptionally(new OnshapeException("Maximum number of calls reached when polling method"));
                        } else {
                            // Try polling again
                            poll(href, responseType, until, future, Math.min(maximumDelay, delay * 2), count + 1);
                        }
                    }
                } catch (OnshapeException ex) {
                    future.completeExceptionally(ex);
                }
            }
        }, delay, TimeUnit.SECONDS);
    }
}
