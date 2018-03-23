/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for VirtualNetworkGatewaySkuName.
 */
public final class VirtualNetworkGatewaySkuName {
    /** Static value Basic for VirtualNetworkGatewaySkuName. */
    public static final VirtualNetworkGatewaySkuName BASIC = new VirtualNetworkGatewaySkuName("Basic");

    /** Static value HighPerformance for VirtualNetworkGatewaySkuName. */
    public static final VirtualNetworkGatewaySkuName HIGH_PERFORMANCE = new VirtualNetworkGatewaySkuName("HighPerformance");

    /** Static value Standard for VirtualNetworkGatewaySkuName. */
    public static final VirtualNetworkGatewaySkuName STANDARD = new VirtualNetworkGatewaySkuName("Standard");

    /** Static value UltraPerformance for VirtualNetworkGatewaySkuName. */
    public static final VirtualNetworkGatewaySkuName ULTRA_PERFORMANCE = new VirtualNetworkGatewaySkuName("UltraPerformance");

    /** Static value VpnGw1 for VirtualNetworkGatewaySkuName. */
    public static final VirtualNetworkGatewaySkuName VPN_GW1 = new VirtualNetworkGatewaySkuName("VpnGw1");

    /** Static value VpnGw2 for VirtualNetworkGatewaySkuName. */
    public static final VirtualNetworkGatewaySkuName VPN_GW2 = new VirtualNetworkGatewaySkuName("VpnGw2");

    /** Static value VpnGw3 for VirtualNetworkGatewaySkuName. */
    public static final VirtualNetworkGatewaySkuName VPN_GW3 = new VirtualNetworkGatewaySkuName("VpnGw3");

    private String value;

    /**
     * Creates a custom value for VirtualNetworkGatewaySkuName.
     * @param value the custom value
     */
    public VirtualNetworkGatewaySkuName(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof VirtualNetworkGatewaySkuName)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        VirtualNetworkGatewaySkuName rhs = (VirtualNetworkGatewaySkuName) obj;
        if (value == null) {
            return rhs.value == null;
        } else {
            return value.equals(rhs.value);
        }
    }
}
