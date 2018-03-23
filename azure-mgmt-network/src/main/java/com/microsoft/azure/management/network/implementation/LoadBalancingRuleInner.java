/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.implementation;

import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.TransportProtocol;
import com.microsoft.azure.management.network.LoadDistribution;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * A load balancing rule for a load balancer.
 */
@JsonFlatten
public class LoadBalancingRuleInner extends SubResource {
    /**
     * A reference to frontend IP addresses.
     */
    @JsonProperty(value = "properties.frontendIPConfiguration")
    private SubResource frontendIPConfiguration;

    /**
     * A reference to a pool of DIPs. Inbound traffic is randomly load balanced
     * across IPs in the backend IPs.
     */
    @JsonProperty(value = "properties.backendAddressPool")
    private SubResource backendAddressPool;

    /**
     * The reference of the load balancer probe used by the load balancing
     * rule.
     */
    @JsonProperty(value = "properties.probe")
    private SubResource probe;

    /**
     * The transport protocol for the external endpoint. Possible values are
     * 'Udp' or 'Tcp'. Possible values include: 'Udp', 'Tcp'.
     */
    @JsonProperty(value = "properties.protocol", required = true)
    private TransportProtocol protocol;

    /**
     * The load distribution policy for this rule. Possible values are
     * 'Default', 'SourceIP', and 'SourceIPProtocol'. Possible values include:
     * 'Default', 'SourceIP', 'SourceIPProtocol'.
     */
    @JsonProperty(value = "properties.loadDistribution")
    private LoadDistribution loadDistribution;

    /**
     * The port for the external endpoint. Port numbers for each Rule must be
     * unique within the Load Balancer. Acceptable values are between 1 and
     * 65534.
     */
    @JsonProperty(value = "properties.frontendPort", required = true)
    private int frontendPort;

    /**
     * The port used for internal connections on the endpoint. Acceptable
     * values are between 1 and 65535.
     */
    @JsonProperty(value = "properties.backendPort")
    private Integer backendPort;

    /**
     * The timeout for the TCP idle connection. The value can be set between 4
     * and 30 minutes. The default value is 4 minutes. This element is only
     * used when the protocol is set to TCP.
     */
    @JsonProperty(value = "properties.idleTimeoutInMinutes")
    private Integer idleTimeoutInMinutes;

    /**
     * Configures a virtual machine's endpoint for the floating IP capability
     * required to configure a SQL AlwaysOn Availability Group. This setting is
     * required when using the SQL AlwaysOn Availability Groups in SQL server.
     * This setting can't be changed after you create the endpoint.
     */
    @JsonProperty(value = "properties.enableFloatingIP")
    private Boolean enableFloatingIP;

    /**
     * Configures SNAT for the VMs in the backend pool to use the publicIP
     * address specified in the frontend of the load balancing rule.
     */
    @JsonProperty(value = "properties.disableOutboundSnat")
    private Boolean disableOutboundSnat;

    /**
     * Gets the provisioning state of the PublicIP resource. Possible values
     * are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Get the frontendIPConfiguration value.
     *
     * @return the frontendIPConfiguration value
     */
    public SubResource frontendIPConfiguration() {
        return this.frontendIPConfiguration;
    }

    /**
     * Set the frontendIPConfiguration value.
     *
     * @param frontendIPConfiguration the frontendIPConfiguration value to set
     * @return the LoadBalancingRuleInner object itself.
     */
    public LoadBalancingRuleInner withFrontendIPConfiguration(SubResource frontendIPConfiguration) {
        this.frontendIPConfiguration = frontendIPConfiguration;
        return this;
    }

    /**
     * Get the backendAddressPool value.
     *
     * @return the backendAddressPool value
     */
    public SubResource backendAddressPool() {
        return this.backendAddressPool;
    }

    /**
     * Set the backendAddressPool value.
     *
     * @param backendAddressPool the backendAddressPool value to set
     * @return the LoadBalancingRuleInner object itself.
     */
    public LoadBalancingRuleInner withBackendAddressPool(SubResource backendAddressPool) {
        this.backendAddressPool = backendAddressPool;
        return this;
    }

    /**
     * Get the probe value.
     *
     * @return the probe value
     */
    public SubResource probe() {
        return this.probe;
    }

    /**
     * Set the probe value.
     *
     * @param probe the probe value to set
     * @return the LoadBalancingRuleInner object itself.
     */
    public LoadBalancingRuleInner withProbe(SubResource probe) {
        this.probe = probe;
        return this;
    }

    /**
     * Get the protocol value.
     *
     * @return the protocol value
     */
    public TransportProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol value.
     *
     * @param protocol the protocol value to set
     * @return the LoadBalancingRuleInner object itself.
     */
    public LoadBalancingRuleInner withProtocol(TransportProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the loadDistribution value.
     *
     * @return the loadDistribution value
     */
    public LoadDistribution loadDistribution() {
        return this.loadDistribution;
    }

    /**
     * Set the loadDistribution value.
     *
     * @param loadDistribution the loadDistribution value to set
     * @return the LoadBalancingRuleInner object itself.
     */
    public LoadBalancingRuleInner withLoadDistribution(LoadDistribution loadDistribution) {
        this.loadDistribution = loadDistribution;
        return this;
    }

    /**
     * Get the frontendPort value.
     *
     * @return the frontendPort value
     */
    public int frontendPort() {
        return this.frontendPort;
    }

    /**
     * Set the frontendPort value.
     *
     * @param frontendPort the frontendPort value to set
     * @return the LoadBalancingRuleInner object itself.
     */
    public LoadBalancingRuleInner withFrontendPort(int frontendPort) {
        this.frontendPort = frontendPort;
        return this;
    }

    /**
     * Get the backendPort value.
     *
     * @return the backendPort value
     */
    public Integer backendPort() {
        return this.backendPort;
    }

    /**
     * Set the backendPort value.
     *
     * @param backendPort the backendPort value to set
     * @return the LoadBalancingRuleInner object itself.
     */
    public LoadBalancingRuleInner withBackendPort(Integer backendPort) {
        this.backendPort = backendPort;
        return this;
    }

    /**
     * Get the idleTimeoutInMinutes value.
     *
     * @return the idleTimeoutInMinutes value
     */
    public Integer idleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes;
    }

    /**
     * Set the idleTimeoutInMinutes value.
     *
     * @param idleTimeoutInMinutes the idleTimeoutInMinutes value to set
     * @return the LoadBalancingRuleInner object itself.
     */
    public LoadBalancingRuleInner withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        return this;
    }

    /**
     * Get the enableFloatingIP value.
     *
     * @return the enableFloatingIP value
     */
    public Boolean enableFloatingIP() {
        return this.enableFloatingIP;
    }

    /**
     * Set the enableFloatingIP value.
     *
     * @param enableFloatingIP the enableFloatingIP value to set
     * @return the LoadBalancingRuleInner object itself.
     */
    public LoadBalancingRuleInner withEnableFloatingIP(Boolean enableFloatingIP) {
        this.enableFloatingIP = enableFloatingIP;
        return this;
    }

    /**
     * Get the disableOutboundSnat value.
     *
     * @return the disableOutboundSnat value
     */
    public Boolean disableOutboundSnat() {
        return this.disableOutboundSnat;
    }

    /**
     * Set the disableOutboundSnat value.
     *
     * @param disableOutboundSnat the disableOutboundSnat value to set
     * @return the LoadBalancingRuleInner object itself.
     */
    public LoadBalancingRuleInner withDisableOutboundSnat(Boolean disableOutboundSnat) {
        this.disableOutboundSnat = disableOutboundSnat;
        return this;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState value.
     *
     * @param provisioningState the provisioningState value to set
     * @return the LoadBalancingRuleInner object itself.
     */
    public LoadBalancingRuleInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the LoadBalancingRuleInner object itself.
     */
    public LoadBalancingRuleInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag value.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag value.
     *
     * @param etag the etag value to set
     * @return the LoadBalancingRuleInner object itself.
     */
    public LoadBalancingRuleInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

}
