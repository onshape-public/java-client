

# BTAppElementParams


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | The label that will appear in the document&#39;s edit history for this operation. If blank, a value will be auto-generated. |  [optional]
**formatId** | **String** | The data type of the application. This string allows an application to distinguish their elements from elements of another application. | 
**jsonTree** | **Object** | Initialization data for the new element&#39;s json tree. |  [optional]
**location** | [**BTElementLocationParams**](BTElementLocationParams.md) |  |  [optional]
**name** | **String** | The name of the element being created. If blank, a name will be auto-generated. |  [optional]
**subelements** | [**List&lt;BTAppElementChangeParams&gt;**](BTAppElementChangeParams.md) | Initialization data for the new element&#39;s subelements. |  [optional]



