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
 * Defines headers for post202Retry200 operation.
 */
public class LROsCustomHeaderPost202Retry200Headers {
    /**
     * Location to poll for result status: will be set to
     * /lro/customheader/post/202/retry/200.
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
     * Get location to poll for result status: will be set to /lro/customheader/post/202/retry/200.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set location to poll for result status: will be set to /lro/customheader/post/202/retry/200.
     *
     * @param location the location value to set
     * @return the LROsCustomHeaderPost202Retry200Headers object itself.
     */
    public LROsCustomHeaderPost202Retry200Headers withLocation(String location) {
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
     * @return the LROsCustomHeaderPost202Retry200Headers object itself.
     */
    public LROsCustomHeaderPost202Retry200Headers withRetryAfter(Integer retryAfter) {
        this.retryAfter = retryAfter;
        return this;
    }

}
