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
 * The interface for the Base Workbook Functions Hyperlink Request Builder.
 */
public interface IBaseWorkbookFunctionsHyperlinkRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsHyperlinkRequest
     *
     * @return the IWorkbookFunctionsHyperlinkRequest instance
     */
    IWorkbookFunctionsHyperlinkRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsHyperlinkRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsHyperlinkRequest instance
     */
    IWorkbookFunctionsHyperlinkRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
