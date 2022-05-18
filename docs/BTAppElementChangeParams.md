

# BTAppElementChangeParams


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**baseContent** | **byte[]** | This base64-encoded data is treated as a full representation of the sub-element&#39;s data and all deltas previously added will no longer be returned. |  [optional]
**delta** | **byte[]** | This base64-encoded data is a delta which the application can apply to the last added baseContent data. |  [optional]
**subelementId** | **String** | The id of the subelement to edit. The value is determined by the application. | 



