/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.management.sql;

import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Fluent;

/**
 * The minimum limit of the reserved eDTUs value range for a "Basic" edition of an Azure SQL Elastic Pool.
 */
@Fluent
@Beta(Beta.SinceVersion.V1_7_0)
public enum SqlElasticPoolBasicMinEDTUs {
    /** 0 reserved minimum eDTUs available for each database in the pool. */
    eDTU_0(0),

    /** 5 reserved minimum eDTUs available for each database in the pool. */
    eDTU_5(5);

    /** The reserved minimum eDTU for each database in the SQL Elastic Pool. */
    private int value;

    SqlElasticPoolBasicMinEDTUs(int eDTU) {
        this.value = eDTU;
    }

    /**
     * @return the reserved minimum eDTU for each database in the SQL Elastic Pool
     */
    public int value() {
        return this.value;
    }
}
