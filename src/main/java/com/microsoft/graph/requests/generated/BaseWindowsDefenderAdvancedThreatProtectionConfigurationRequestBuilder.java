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
 * The class for the Base Windows Defender Advanced Threat Protection Configuration Request Builder.
 */
public class BaseWindowsDefenderAdvancedThreatProtectionConfigurationRequestBuilder extends BaseRequestBuilder implements IBaseWindowsDefenderAdvancedThreatProtectionConfigurationRequestBuilder {

    /**
     * The request builder for the WindowsDefenderAdvancedThreatProtectionConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWindowsDefenderAdvancedThreatProtectionConfigurationRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IWindowsDefenderAdvancedThreatProtectionConfigurationRequest instance
     */
    public IWindowsDefenderAdvancedThreatProtectionConfigurationRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IWindowsDefenderAdvancedThreatProtectionConfigurationRequest instance
     */
    public IWindowsDefenderAdvancedThreatProtectionConfigurationRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new WindowsDefenderAdvancedThreatProtectionConfigurationRequest(getRequestUrl(), getClient(), requestOptions);
    }

}
