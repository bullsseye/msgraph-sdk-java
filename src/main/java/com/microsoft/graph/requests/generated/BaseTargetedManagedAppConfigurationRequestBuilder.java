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
 * The class for the Base Targeted Managed App Configuration Request Builder.
 */
public class BaseTargetedManagedAppConfigurationRequestBuilder extends BaseRequestBuilder implements IBaseTargetedManagedAppConfigurationRequestBuilder {

    /**
     * The request builder for the TargetedManagedAppConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseTargetedManagedAppConfigurationRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the ITargetedManagedAppConfigurationRequest instance
     */
    public ITargetedManagedAppConfigurationRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ITargetedManagedAppConfigurationRequest instance
     */
    public ITargetedManagedAppConfigurationRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new TargetedManagedAppConfigurationRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IManagedMobileAppCollectionRequestBuilder apps() {
        return new ManagedMobileAppCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("apps"), getClient(), null);
    }

    public IManagedMobileAppRequestBuilder apps(final String id) {
        return new ManagedMobileAppRequestBuilder(getRequestUrlWithAdditionalSegment("apps") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for ManagedAppPolicyDeploymentSummary
     *
     * @return the IManagedAppPolicyDeploymentSummaryRequestBuilder instance
     */
    public IManagedAppPolicyDeploymentSummaryRequestBuilder deploymentSummary() {
        return new ManagedAppPolicyDeploymentSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("deploymentSummary"), getClient(), null);
    }
    public ITargetedManagedAppPolicyAssignmentCollectionRequestBuilder assignments() {
        return new TargetedManagedAppPolicyAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    public ITargetedManagedAppPolicyAssignmentRequestBuilder assignments(final String id) {
        return new TargetedManagedAppPolicyAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }

    public ITargetedManagedAppConfigurationAssignRequestBuilder assign(final java.util.List<TargetedManagedAppPolicyAssignment> assignments) {
        return new TargetedManagedAppConfigurationAssignRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assign"), getClient(), null, assignments);
    }

    public ITargetedManagedAppConfigurationTargetAppsRequestBuilder targetApps(final java.util.List<ManagedMobileApp> apps) {
        return new TargetedManagedAppConfigurationTargetAppsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.targetApps"), getClient(), null, apps);
    }
}
