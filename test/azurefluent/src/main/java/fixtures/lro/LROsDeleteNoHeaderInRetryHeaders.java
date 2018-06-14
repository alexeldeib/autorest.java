/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.lro;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines headers for deleteNoHeaderInRetry operation.
 */
public class LROsDeleteNoHeaderInRetryHeaders {
    /**
     * Location to poll for result status: will be set to
     * /lro/put/noheader/202/204/operationresults.
     */
    @JsonProperty(value = "Location")
    private String location;

    /**
     * Get location to poll for result status: will be set to /lro/put/noheader/202/204/operationresults.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set location to poll for result status: will be set to /lro/put/noheader/202/204/operationresults.
     *
     * @param location the location value to set
     * @return the LROsDeleteNoHeaderInRetryHeaders object itself.
     */
    public LROsDeleteNoHeaderInRetryHeaders withLocation(String location) {
        this.location = location;
        return this;
    }

}
