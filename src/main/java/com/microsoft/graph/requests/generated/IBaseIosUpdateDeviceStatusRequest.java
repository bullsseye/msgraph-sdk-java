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
 * The interface for the Base Ios Update Device Status Request.
 */
public interface IBaseIosUpdateDeviceStatusRequest extends IHttpRequest {

    /**
     * Gets the IosUpdateDeviceStatus from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<IosUpdateDeviceStatus> callback);

    /**
     * Gets the IosUpdateDeviceStatus from the service
     *
     * @return the IosUpdateDeviceStatus from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IosUpdateDeviceStatus get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<Void> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this IosUpdateDeviceStatus with a source
     *
     * @param sourceIosUpdateDeviceStatus the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final IosUpdateDeviceStatus sourceIosUpdateDeviceStatus, final ICallback<IosUpdateDeviceStatus> callback);

    /**
     * Patches this IosUpdateDeviceStatus with a source
     *
     * @param sourceIosUpdateDeviceStatus the source object with updates
     * @return the updated IosUpdateDeviceStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IosUpdateDeviceStatus patch(final IosUpdateDeviceStatus sourceIosUpdateDeviceStatus) throws ClientException;

    /**
     * Posts a IosUpdateDeviceStatus with a new object
     *
     * @param newIosUpdateDeviceStatus the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final IosUpdateDeviceStatus newIosUpdateDeviceStatus, final ICallback<IosUpdateDeviceStatus> callback);

    /**
     * Posts a IosUpdateDeviceStatus with a new object
     *
     * @param newIosUpdateDeviceStatus the new object to create
     * @return the created IosUpdateDeviceStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IosUpdateDeviceStatus post(final IosUpdateDeviceStatus newIosUpdateDeviceStatus) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseIosUpdateDeviceStatusRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseIosUpdateDeviceStatusRequest expand(final String value);

}

