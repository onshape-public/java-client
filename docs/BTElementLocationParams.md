

# BTElementLocationParams

The location at which the new element should be inserted.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**elementId** | **String** | The id of an element which provides context for the position value specified. |  [optional]
**position** | **Integer** | An indicator for the relative placement of the new element. If elementId is specified, a negative number indicates insertion prior to the element and a non-negative number indicates insertion following the element. If no elementId is specified, a negative value indicates insertion at the end of the element list and a non-negative number indicates insertion at the start of the element list. |  [optional]



