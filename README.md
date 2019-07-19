Onshape API Java Client
=======================

This is a Java library for accessing the Onshape APIs from both cloud and
desktop applications.

Copyright 2018 Onshape Inc.

[Javadoc documentation](http://onshape-public.github.io/java-client/index.html?com/onshape/api/Onshape.html)

# Usage: Maven

To use from Maven, add the following to pom.xml:

```
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```

and

```
	<dependency>
	    <groupId>com.github.onshape-public</groupId>
	    <artifactId>java-client</artifactId>
	    <version>v1.99.23855.f5cc4a550faa</version>
	</dependency>
```

# Usage: Gradle

To use from Gradle, add the following to build.gradle:

```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

and

```
	dependencies {
	        implementation 'com.github.onshape-public:java-client:v1.99.23855.f5cc4a550faa'
	}
```

