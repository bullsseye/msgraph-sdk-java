// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;

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

/**
 * The Enum Device Management Partner Tenant State.
*/
public enum DeviceManagementPartnerTenantState
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * unavailable
    */
    UNAVAILABLE,
    /**
    * enabled
    */
    ENABLED,
    /**
    * terminated
    */
    TERMINATED,
    /**
    * rejected
    */
    REJECTED,
    /**
    * unresponsive
    */
    UNRESPONSIVE,
    /**
    * For DeviceManagementPartnerTenantState values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
