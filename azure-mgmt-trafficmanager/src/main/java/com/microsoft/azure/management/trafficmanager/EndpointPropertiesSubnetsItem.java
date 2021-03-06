/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.trafficmanager;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Subnet first address, scope, and/or last address.
 */
public class EndpointPropertiesSubnetsItem {
    /**
     * First address in the subnet.
     */
    @JsonProperty(value = "first")
    private String first;

    /**
     * Last address in the subnet.
     */
    @JsonProperty(value = "last")
    private String last;

    /**
     * Block size (number of leading bits in the subnet mask).
     */
    @JsonProperty(value = "scope")
    private Integer scope;

    /**
     * Get first address in the subnet.
     *
     * @return the first value
     */
    public String first() {
        return this.first;
    }

    /**
     * Set first address in the subnet.
     *
     * @param first the first value to set
     * @return the EndpointPropertiesSubnetsItem object itself.
     */
    public EndpointPropertiesSubnetsItem withFirst(String first) {
        this.first = first;
        return this;
    }

    /**
     * Get last address in the subnet.
     *
     * @return the last value
     */
    public String last() {
        return this.last;
    }

    /**
     * Set last address in the subnet.
     *
     * @param last the last value to set
     * @return the EndpointPropertiesSubnetsItem object itself.
     */
    public EndpointPropertiesSubnetsItem withLast(String last) {
        this.last = last;
        return this;
    }

    /**
     * Get block size (number of leading bits in the subnet mask).
     *
     * @return the scope value
     */
    public Integer scope() {
        return this.scope;
    }

    /**
     * Set block size (number of leading bits in the subnet mask).
     *
     * @param scope the scope value to set
     * @return the EndpointPropertiesSubnetsItem object itself.
     */
    public EndpointPropertiesSubnetsItem withScope(Integer scope) {
        this.scope = scope;
        return this;
    }

}
