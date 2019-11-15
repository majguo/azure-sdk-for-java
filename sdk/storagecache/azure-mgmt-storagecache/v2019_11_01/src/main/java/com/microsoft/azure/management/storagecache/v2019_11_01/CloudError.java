/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagecache.v2019_11_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An error response.
 */
public class CloudError {
    /**
     * The body of the error.
     */
    @JsonProperty(value = "error")
    private CloudErrorBody error;

    /**
     * Get the body of the error.
     *
     * @return the error value
     */
    public CloudErrorBody error() {
        return this.error;
    }

    /**
     * Set the body of the error.
     *
     * @param error the error value to set
     * @return the CloudError object itself.
     */
    public CloudError withError(CloudErrorBody error) {
        this.error = error;
        return this;
    }

}