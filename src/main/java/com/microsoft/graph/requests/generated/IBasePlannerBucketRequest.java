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
 * The interface for the Base Planner Bucket Request.
 */
public interface IBasePlannerBucketRequest extends IHttpRequest {

    /**
     * Gets the PlannerBucket from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<PlannerBucket> callback);

    /**
     * Gets the PlannerBucket from the service
     *
     * @return the PlannerBucket from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PlannerBucket get() throws ClientException;

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
     * Patches this PlannerBucket with a source
     *
     * @param sourcePlannerBucket the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final PlannerBucket sourcePlannerBucket, final ICallback<PlannerBucket> callback);

    /**
     * Patches this PlannerBucket with a source
     *
     * @param sourcePlannerBucket the source object with updates
     * @return the updated PlannerBucket
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PlannerBucket patch(final PlannerBucket sourcePlannerBucket) throws ClientException;

    /**
     * Posts a PlannerBucket with a new object
     *
     * @param newPlannerBucket the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final PlannerBucket newPlannerBucket, final ICallback<PlannerBucket> callback);

    /**
     * Posts a PlannerBucket with a new object
     *
     * @param newPlannerBucket the new object to create
     * @return the created PlannerBucket
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PlannerBucket post(final PlannerBucket newPlannerBucket) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBasePlannerBucketRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBasePlannerBucketRequest expand(final String value);

}

