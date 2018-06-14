/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.lro.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines headers for postAsyncRelativeRetryNoPayload operation.
 */
public class LROSADsPostAsyncRelativeRetryNoPayloadHeaders {
    /**
     * Location to poll for result status: will be set to
     * /lro/error/putasync/retry/failed/operationResults/nopayload.
     */
    @JsonProperty(value = "Azure-AsyncOperation")
    private String azureAsyncOperation;

    /**
     * Location to poll for result status: will be set to
     * /lro/error/putasync/retry/failed/operationResults/nopayload.
     */
    @JsonProperty(value = "Location")
    private String location;

    /**
     * Number of milliseconds until the next poll should be sent, will be set
     * to zero.
     */
    @JsonProperty(value = "Retry-After")
    private Integer retryAfter;

    /**
     * Get location to poll for result status: will be set to /lro/error/putasync/retry/failed/operationResults/nopayload.
     *
     * @return the azureAsyncOperation value
     */
    public String azureAsyncOperation() {
        return this.azureAsyncOperation;
    }

    /**
     * Set location to poll for result status: will be set to /lro/error/putasync/retry/failed/operationResults/nopayload.
     *
     * @param azureAsyncOperation the azureAsyncOperation value to set
     * @return the LROSADsPostAsyncRelativeRetryNoPayloadHeaders object itself.
     */
    public LROSADsPostAsyncRelativeRetryNoPayloadHeaders withAzureAsyncOperation(String azureAsyncOperation) {
        this.azureAsyncOperation = azureAsyncOperation;
        return this;
    }

    /**
     * Get location to poll for result status: will be set to /lro/error/putasync/retry/failed/operationResults/nopayload.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set location to poll for result status: will be set to /lro/error/putasync/retry/failed/operationResults/nopayload.
     *
     * @param location the location value to set
     * @return the LROSADsPostAsyncRelativeRetryNoPayloadHeaders object itself.
     */
    public LROSADsPostAsyncRelativeRetryNoPayloadHeaders withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get number of milliseconds until the next poll should be sent, will be set to zero.
     *
     * @return the retryAfter value
     */
    public Integer retryAfter() {
        return this.retryAfter;
    }

    /**
     * Set number of milliseconds until the next poll should be sent, will be set to zero.
     *
     * @param retryAfter the retryAfter value to set
     * @return the LROSADsPostAsyncRelativeRetryNoPayloadHeaders object itself.
     */
    public LROSADsPostAsyncRelativeRetryNoPayloadHeaders withRetryAfter(Integer retryAfter) {
        this.retryAfter = retryAfter;
        return this;
    }

}
