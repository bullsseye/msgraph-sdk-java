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
 * The Enum Rating Canada Movies Type.
*/
public enum RatingCanadaMoviesType
{
    /**
    * all Allowed
    */
    ALL_ALLOWED,
    /**
    * all Blocked
    */
    ALL_BLOCKED,
    /**
    * general
    */
    GENERAL,
    /**
    * parental Guidance
    */
    PARENTAL_GUIDANCE,
    /**
    * ages Above14
    */
    AGES_ABOVE14,
    /**
    * ages Above18
    */
    AGES_ABOVE18,
    /**
    * restricted
    */
    RESTRICTED,
    /**
    * For RatingCanadaMoviesType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}
