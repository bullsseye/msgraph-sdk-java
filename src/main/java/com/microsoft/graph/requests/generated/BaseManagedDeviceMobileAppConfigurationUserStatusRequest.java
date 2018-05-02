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
 * The class for the Base Managed Device Mobile App Configuration User Status Request.
 */
public class BaseManagedDeviceMobileAppConfigurationUserStatusRequest extends BaseRequest implements IBaseManagedDeviceMobileAppConfigurationUserStatusRequest {

    /**
     * The request for the ManagedDeviceMobileAppConfigurationUserStatus
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BaseManagedDeviceMobileAppConfigurationUserStatusRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<ManagedDeviceMobileAppConfigurationUserStatus> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the ManagedDeviceMobileAppConfigurationUserStatus from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<ManagedDeviceMobileAppConfigurationUserStatus> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ManagedDeviceMobileAppConfigurationUserStatus from the service
     *
     * @return the ManagedDeviceMobileAppConfigurationUserStatus from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedDeviceMobileAppConfigurationUserStatus get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this ManagedDeviceMobileAppConfigurationUserStatus with a source
     *
     * @param sourceManagedDeviceMobileAppConfigurationUserStatus the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ManagedDeviceMobileAppConfigurationUserStatus sourceManagedDeviceMobileAppConfigurationUserStatus, final ICallback<ManagedDeviceMobileAppConfigurationUserStatus> callback) {
        send(HttpMethod.PATCH, callback, sourceManagedDeviceMobileAppConfigurationUserStatus);
    }

    /**
     * Patches this ManagedDeviceMobileAppConfigurationUserStatus with a source
     *
     * @param sourceManagedDeviceMobileAppConfigurationUserStatus the source object with updates
     * @return the updated ManagedDeviceMobileAppConfigurationUserStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedDeviceMobileAppConfigurationUserStatus patch(final ManagedDeviceMobileAppConfigurationUserStatus sourceManagedDeviceMobileAppConfigurationUserStatus) throws ClientException {
        return send(HttpMethod.PATCH, sourceManagedDeviceMobileAppConfigurationUserStatus);
    }

    /**
     * Creates a ManagedDeviceMobileAppConfigurationUserStatus with a new object
     *
     * @param newManagedDeviceMobileAppConfigurationUserStatus the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ManagedDeviceMobileAppConfigurationUserStatus newManagedDeviceMobileAppConfigurationUserStatus, final ICallback<ManagedDeviceMobileAppConfigurationUserStatus> callback) {
        send(HttpMethod.POST, callback, newManagedDeviceMobileAppConfigurationUserStatus);
    }

    /**
     * Creates a ManagedDeviceMobileAppConfigurationUserStatus with a new object
     *
     * @param newManagedDeviceMobileAppConfigurationUserStatus the new object to create
     * @return the created ManagedDeviceMobileAppConfigurationUserStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagedDeviceMobileAppConfigurationUserStatus post(final ManagedDeviceMobileAppConfigurationUserStatus newManagedDeviceMobileAppConfigurationUserStatus) throws ClientException {
        return send(HttpMethod.POST, newManagedDeviceMobileAppConfigurationUserStatus);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IManagedDeviceMobileAppConfigurationUserStatusRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (ManagedDeviceMobileAppConfigurationUserStatusRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IManagedDeviceMobileAppConfigurationUserStatusRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (ManagedDeviceMobileAppConfigurationUserStatusRequest)this;
     }

}
