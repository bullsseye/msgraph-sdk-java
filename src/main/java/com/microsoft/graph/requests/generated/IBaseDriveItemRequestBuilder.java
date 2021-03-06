// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Drive Item Request Builder.
 */
public interface IBaseDriveItemRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IDriveItemRequest instance
     */
    IDriveItemRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IDriveItemRequest instance
     */
    IDriveItemRequest buildRequest(final java.util.List<? extends Option> requestOptions);

    IDriveItemCollectionRequestBuilder children();

    IDriveItemRequestBuilder children(final String id);

    /**
     * Gets the request builder for ListItem
     *
     * @return the IListItemRequestBuilder instance
     */
    IListItemRequestBuilder listItem();

    IPermissionCollectionRequestBuilder permissions();

    IPermissionRequestBuilder permissions(final String id);

    IThumbnailSetCollectionRequestBuilder thumbnails();

    IThumbnailSetRequestBuilder thumbnails(final String id);

    /**
     * Gets the request builder for Workbook
     *
     * @return the IWorkbookRequestBuilder instance
     */
    IWorkbookRequestBuilder workbook();

    IDriveItemStreamRequestBuilder content();
    IDriveItemCopyRequestBuilder copy(final String name, final ItemReference parentReference);
    IDriveItemCreateLinkRequestBuilder createLink(final String type, final String scope);
    IDriveItemCreateUploadSessionRequestBuilder createUploadSession(final DriveItemUploadableProperties item);

    IDriveItemInviteCollectionRequestBuilder invite(final Boolean requireSignIn, final java.util.List<String> roles, final Boolean sendInvitation, final String message, final java.util.List<DriveRecipient> recipients);

    IDriveItemDeltaCollectionRequestBuilder delta(final String token);

    IDriveItemDeltaCollectionRequestBuilder delta();

    IDriveItemSearchCollectionRequestBuilder search(final String q);

}
