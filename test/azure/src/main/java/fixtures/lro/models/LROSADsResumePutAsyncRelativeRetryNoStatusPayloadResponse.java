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

import com.microsoft.rest.v2.RestResponse;
import java.util.Map;

/**
 * Contains all response data for the resumePutAsyncRelativeRetryNoStatusPayload operation.
 */
public final class LROSADsResumePutAsyncRelativeRetryNoStatusPayloadResponse extends RestResponse<LROSADsPutAsyncRelativeRetryNoStatusPayloadHeaders, Product> {
    /**
     * Creates an instance of LROSADsResumePutAsyncRelativeRetryNoStatusPayloadResponse.
     *
     * @param statusCode the status code of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param body the deserialized body of the HTTP response.
     */
    public LROSADsResumePutAsyncRelativeRetryNoStatusPayloadResponse(int statusCode, LROSADsPutAsyncRelativeRetryNoStatusPayloadHeaders headers, Map<String, String> rawHeaders, Product body) {
        super(statusCode, headers, rawHeaders, body);
    }

    /**
     * @return the deserialized response headers.
     */
    @Override
    public LROSADsPutAsyncRelativeRetryNoStatusPayloadHeaders headers() {
        return super.headers();
    }

    /**
     * @return the deserialized response body.
     */
    @Override
    public Product body() {
        return super.body();
    }
}
