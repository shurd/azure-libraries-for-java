/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.management.network;

import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Fluent;
import com.microsoft.azure.management.network.implementation.NetworkManager;
import com.microsoft.azure.management.network.implementation.PublicIPAddressInner;
import com.microsoft.azure.management.network.model.UpdatableWithTags;
import com.microsoft.azure.management.resources.fluentcore.arm.AvailabilityZoneId;
import com.microsoft.azure.management.resources.fluentcore.arm.models.GroupableResource;
import com.microsoft.azure.management.resources.fluentcore.arm.models.Resource;
import com.microsoft.azure.management.resources.fluentcore.model.Creatable;
import com.microsoft.azure.management.resources.fluentcore.model.Refreshable;
import com.microsoft.azure.management.resources.fluentcore.model.Updatable;
import com.microsoft.azure.management.resources.fluentcore.model.Appliable;

import java.util.List;
import java.util.Set;

/**
 * Public IP address.
 */
@Fluent()
public interface PublicIPAddress extends
        GroupableResource<NetworkManager, PublicIPAddressInner>,
        Refreshable<PublicIPAddress>,
        Updatable<PublicIPAddress.Update>,
        UpdatableWithTags<PublicIPAddress> {

    // Getters

    /**
     * @return the IP version of the public IP address
     */
    IPVersion version();

    /**
     * @return the assigned IP address
     */
    String ipAddress();

    /**
     * @return the assigned leaf domain label
     */
    String leafDomainLabel();

    /**
     * @return the assigned FQDN (fully qualified domain name)
     */
    String fqdn();

    /**
     * @return the assigned reverse FQDN, if any
     */
    String reverseFqdn();

    /**
     * @return the IP address allocation method (Static/Dynamic)
     */
    IPAllocationMethod ipAllocationMethod();

    /**
     * @return the idle connection timeout setting (in minutes)
     */
    int idleTimeoutInMinutes();

    /**
     * @return the load balancer public frontend that this public IP address is assigned to
     */
    LoadBalancerPublicFrontend getAssignedLoadBalancerFrontend();

    /**
     * @return true if this public IP address is assigned to a load balancer
     */
    boolean hasAssignedLoadBalancer();

    /**
     * @return the network interface IP configuration that this public IP address is assigned to
     */
    NicIPConfiguration getAssignedNetworkInterfaceIPConfiguration();

    /**
     * @return true if this public IP address is assigned to a network interface
     */
    boolean hasAssignedNetworkInterface();

    /**
     * @return the availability zones assigned to the public IP address
     */
    @Beta(Beta.SinceVersion.V1_3_0)
    Set<AvailabilityZoneId> availabilityZones();

    /**
     * @return public IP address sku.
     */
    @Beta(Beta.SinceVersion.V1_3_0)
    PublicIPSkuType sku();

    /**
     * @return read-only list of ipTags assosiated with public ip address
     */
    @Beta(Beta.SinceVersion.V1_10_0)
    List<IpTag> ipTags();

    /**
     * Container interface for all the definitions.
     */
    interface Definition extends
        DefinitionStages.Blank,
        DefinitionStages.WithGroup,
        DefinitionStages.WithCreate {
    }

    /**
     * Grouping of public IP address definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a public IP address definition.
         */
        interface Blank
            extends GroupableResource.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the public IP address definition allowing to specify the resource group.
         */
        interface WithGroup
            extends GroupableResource.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * A public IP address definition allowing to set the IP allocation method (static or dynamic).
         */
        interface WithIPAddress {
            /**
             * Enables static IP address allocation.
             * <p>
             * Use {@link PublicIPAddress#ipAddress()} after the public IP address is created to obtain the
             * actual IP address allocated for this resource by Azure
             *
             * @return the next stage of the definition
             */
            WithCreate withStaticIP();

            /**
             * Enables dynamic IP address allocation.
             *
             * @return the next stage of the definition
             */
            WithCreate withDynamicIP();
        }

        /**
         * A public IP address definition allowing to specify the leaf domain label, if any.
         */
        interface WithLeafDomainLabel {
            /**
             * Specifies the leaf domain label to associate with this public IP address.
             * <p>
             * The fully qualified domain name (FQDN)
             * will be constructed automatically by appending the rest of the domain to this label.
             * @param dnsName the leaf domain label to use. This must follow the required naming convention for leaf domain names.
             * @return the next stage of the definition
             */
            WithCreate withLeafDomainLabel(String dnsName);

            /**
             * Ensures that no leaf domain label will be used.
             * <p>
             * This means that this public IP address will not be associated with a domain name.
             * @return the next stage of the definition
             */
            WithCreate withoutLeafDomainLabel();
        }

        /**
         * A public IP address definition allowing the reverse FQDN to be specified.
         */
        interface WithReverseFQDN {
            /**
             * Specifies the reverse FQDN to assign to this public IP address.
             * <p>
             *
             * @param reverseFQDN the reverse FQDN to assign
             * @return the next stage of the definition
             */
            WithCreate withReverseFqdn(String reverseFQDN);

            /**
             * Ensures that no reverse FQDN will be used.
             * @return the next stage of the definition
             */
            WithCreate withoutReverseFqdn();
        }

        /**
         * A public IP address definition allowing the idle timeout to be specified.
         */
        interface WithIdleTimeout {
            /**
             * Specifies the timeout (in minutes) for an idle connection.
             *
             * @param minutes the length of the time out in minutes
             * @return the next stage of the definition
             */
            WithCreate withIdleTimeoutInMinutes(int minutes);
        }

        /**
         * The stage of the IP address definition allowing to specify availability zone.
         */
        @Beta(Beta.SinceVersion.V1_3_0)
        interface WithAvailabilityZone {
            /**
             * Specifies the availability zone for the IP address.
             *
             * @param zoneId the zone identifier.
             * @return the next stage of the definition
             */
            @Beta(Beta.SinceVersion.V1_3_0)
            WithCreate withAvailabilityZone(AvailabilityZoneId zoneId);
        }

        /**
         * The stage of the IP address definition allowing to specify SKU.
         */
        @Beta(Beta.SinceVersion.V1_3_0)
        interface WithSku {
            /**
             * Specifies the SKU for the IP address.
             *
             * @param skuType the SKU type
             * @return the next stage of the definition
             */
            WithCreate withSku(PublicIPSkuType skuType);
        }

        /**
         * The stage of the definition allowing to specify ipTags associated with the public IP address.
         */
        @Beta(Beta.SinceVersion.V1_10_0)
        interface WithIpTag {
            /**
             * Sets an ipTag associated with the public IP address.
             * @param tag ip tag value
             * @return the next stage of the definition
             */
            WithCreate withIpTag(String tag);

            /**
             * Sets an ipTag associated with the public IP address.
             * @param tag ip tag value
             * @param ipTagType ipTagType
             * @return the next stage of the definition
             */
            WithCreate withIpTag(String tag, String ipTagType);
        }

        /**
         * The stage of the public IP definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends
            Creatable<PublicIPAddress>,
            DefinitionStages.WithLeafDomainLabel,
            DefinitionStages.WithIPAddress,
            DefinitionStages.WithReverseFQDN,
            DefinitionStages.WithIdleTimeout,
            DefinitionStages.WithAvailabilityZone,
            DefinitionStages.WithSku,
            DefinitionStages.WithIpTag,
            Resource.DefinitionWithTags<WithCreate> {
        }
    }

    /**
     * Container interface for all the updates.
     * <p>
     * Use {@link Update#apply()} to apply the changes to the resource in Azure.
     */
    interface Update extends
        Appliable<PublicIPAddress>,
        UpdateStages.WithIPAddress,
        UpdateStages.WithLeafDomainLabel,
        UpdateStages.WithReverseFQDN,
        UpdateStages.WithIdleTimout,
        UpdateStages.WithIpTag,
        Resource.UpdateWithTags<Update> {
    }

    /**
     * Grouping of public IP address update stages.
     */
    interface UpdateStages {
        /**
         * A public IP address update allowing to change the IP allocation method (static or dynamic).
         */
        interface WithIPAddress {
            /**
             * Enables static IP address allocation.
             * <p>
             * Use {@link PublicIPAddress#ipAddress()} after the public IP address is updated to
             * obtain the actual IP address allocated for this resource by Azure
             *
             * @return the next stage of the resource update
             */
            Update withStaticIP();

            /**
             * Enables dynamic IP address allocation.
             *
             * @return the next stage of the resource update
             */
            Update withDynamicIP();
        }

        /**
         * A public IP address update allowing to change the leaf domain label, if any.
         */
        interface WithLeafDomainLabel {
            /**
             * Specifies the leaf domain label to associate with this public IP address.
             * <p>
             * The fully qualified domain name (FQDN)
             * will be constructed automatically by appending the rest of the domain to this label.
             * @param dnsName the leaf domain label to use. This must follow the required naming convention for leaf domain names.
             * @return the next stage of the resource update
             */
            Update withLeafDomainLabel(String dnsName);

            /**
             * Ensures that no leaf domain label will be used.
             * <p>
             * This means that this public IP address will not be associated with a domain name.
             * @return the next stage of the resource update
             */
            Update withoutLeafDomainLabel();
        }

        /**
         * A public IP address update allowing the reverse FQDN to be changed.
         */
        interface WithReverseFQDN {
            /**
             * Specifies the reverse FQDN to assign to this public IP address.
             *
             * @param reverseFQDN the reverse FQDN to assign
             * @return the next stage of the resource update
             */
            Update withReverseFqdn(String reverseFQDN);

            /**
             * Ensures that no reverse FQDN will be used.
             *
             * @return The next stage of the resource update
             */
            Update withoutReverseFqdn();
        }

        /**
         * A public IP address update allowing the idle timeout to be changed.
         */
        interface WithIdleTimout {
            /**
             * Specifies the timeout (in minutes) for an idle connection.
             *
             * @param minutes the length of the time out in minutes
             * @return the next stage of the resource update
             */
            Update withIdleTimeoutInMinutes(int minutes);
        }

        /**
         * The stage of the update allowing to specify ipTags associated with the public IP address.
         */
        @Beta(Beta.SinceVersion.V1_10_0)
        interface WithIpTag {
            /**
             * Sets an ipTag associated with the public IP address.
             * @param tag ip tag value
             * @return the next stage of the update
             */
            Update withIpTag(String tag);

            /**
             * Sets an ipTag associated with the public IP address.
             * @param tag ip tag value
             * @param ipTagType ipTagType
             * @return the next stage of the update
             */
            Update withIpTag(String tag, String ipTagType);

            /**
             * Removes an ipTag associated with the public IP address.
             * @param tag ip tag value
             * @return the next stage of the update
             */
            Update withoutIpTag(String tag);
        }
    }
}
