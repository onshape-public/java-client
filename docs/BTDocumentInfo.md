

# BTDocumentInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**anonymousAccessAllowed** | **Boolean** |  |  [optional]
**anonymousAllowsExport** | **Boolean** |  |  [optional]
**betaCapabilityIds** | **List&lt;String&gt;** |  |  [optional]
**canMove** | **Boolean** |  |  [optional]
**canUnshare** | **Boolean** |  |  [optional]
**createdAt** | **OffsetDateTime** |  |  [optional]
**createdBy** | [**BTUserBasicSummaryInfo**](BTUserBasicSummaryInfo.md) |  |  [optional]
**createdWithEducationPlan** | **Boolean** |  |  [optional]
**defaultElementId** | **String** |  |  [optional]
**defaultWorkspace** | [**BTWorkspaceInfo**](BTWorkspaceInfo.md) |  |  [optional]
**description** | **String** |  |  [optional]
**documentLabels** | [**List&lt;BTDocumentLabelInfo&gt;**](BTDocumentLabelInfo.md) |  |  [optional]
**documentThumbnailElementId** | **String** |  |  [optional]
**documentType** | **Integer** |  |  [optional]
**duplicateNameViolationError** | **String** |  |  [optional]
**hasReleaseRevisionableObjects** | **Boolean** |  |  [optional]
**hasRelevantInsertables** | **Boolean** |  |  [optional]
**href** | **URI** |  |  [optional]
**id** | **String** |  |  [optional]
**isContainer** | **Boolean** |  |  [optional]
**isEnterpriseOwned** | **Boolean** |  |  [optional]
**isMutable** | **Boolean** |  |  [optional]
**isOrphaned** | **Boolean** |  |  [optional]
**isUpgradedToLatestVersion** | **Boolean** |  |  [optional]
**isUsingManagedWorkflow** | **Boolean** |  |  [optional]
**likedByCurrentUser** | **Boolean** |  |  [optional]
**likes** | **Long** |  |  [optional]
**modifiedAt** | **OffsetDateTime** |  |  [optional]
**modifiedBy** | [**BTUserBasicSummaryInfo**](BTUserBasicSummaryInfo.md) |  |  [optional]
**name** | **String** |  |  [optional]
**notRevisionManaged** | **Boolean** |  |  [optional]
**numberOfTimesCopied** | **Long** |  |  [optional]
**numberOfTimesReferenced** | **Long** |  |  [optional]
**owner** | [**BTOwnerInfo**](BTOwnerInfo.md) |  |  [optional]
**parentId** | **String** |  |  [optional]
**permission** | [**PermissionEnum**](#PermissionEnum) |  |  [optional]
**permissionSet** | **List&lt;String&gt;** |  |  [optional]
**projectId** | **String** |  |  [optional]
**_public** | **Boolean** |  |  [optional]
**recentVersion** | [**BTBaseInfo**](BTBaseInfo.md) |  |  [optional]
**resourceType** | **String** |  |  [optional]
**supportTeamUserAndShared** | **Boolean** |  |  [optional]
**tags** | **List&lt;String&gt;** |  |  [optional]
**thumbnail** | [**BTThumbnailInfo**](BTThumbnailInfo.md) |  |  [optional]
**totalWorkspacesScheduledForUpdate** | **Integer** |  |  [optional]
**totalWorkspacesUpdating** | **Integer** |  |  [optional]
**trash** | **Boolean** |  |  [optional]
**trashedAt** | **OffsetDateTime** |  |  [optional]
**treeHref** | **String** |  |  [optional]
**userAccountLimitsBreached** | **Boolean** |  |  [optional]
**viewRef** | **URI** |  |  [optional]



## Enum: PermissionEnum

Name | Value
---- | -----
NOACCESS | &quot;NOACCESS&quot;
ANONYMOUS_ACCESS | &quot;ANONYMOUS_ACCESS&quot;
READ | &quot;READ&quot;
READ_COPY_EXPORT | &quot;READ_COPY_EXPORT&quot;
COMMENT | &quot;COMMENT&quot;
WRITE | &quot;WRITE&quot;
RESHARE | &quot;RESHARE&quot;
FULL | &quot;FULL&quot;
OWNER | &quot;OWNER&quot;



