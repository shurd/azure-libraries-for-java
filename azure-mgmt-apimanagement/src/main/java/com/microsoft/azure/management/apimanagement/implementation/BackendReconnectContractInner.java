/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.implementation;

import org.joda.time.Period;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Reconnect request parameters.
 */
@JsonFlatten
public class BackendReconnectContractInner extends Resource {
    /**
     * Duration in ISO8601 format after which reconnect will be initiated.
     * Minimum duration of the Reconect is PT2M.
     */
    @JsonProperty(value = "properties.after")
    private Period after;

    /**
     * Get the after value.
     *
     * @return the after value
     */
    public Period after() {
        return this.after;
    }

    /**
     * Set the after value.
     *
     * @param after the after value to set
     * @return the BackendReconnectContractInner object itself.
     */
    public BackendReconnectContractInner withAfter(Period after) {
        this.after = after;
        return this;
    }

}