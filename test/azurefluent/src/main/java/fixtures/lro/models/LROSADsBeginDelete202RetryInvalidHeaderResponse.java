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
import fixtures.lro.implementation.LROSADsDelete202RetryInvalidHeaderHeadersInner;
import java.util.Map;

/**
 * Contains all response data for the beginDelete202RetryInvalidHeader operation.
 */
public final class LROSADsBeginDelete202RetryInvalidHeaderResponse extends RestResponse<LROSADsDelete202RetryInvalidHeaderHeadersInner, Void> {
    /**
     * Creates an instance of LROSADsBeginDelete202RetryInvalidHeaderResponse.
     *
     * @param statusCode the status code of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param body the deserialized body of the HTTP response.
     */
    public LROSADsBeginDelete202RetryInvalidHeaderResponse(int statusCode, LROSADsDelete202RetryInvalidHeaderHeadersInner headers, Map<String, String> rawHeaders, Void body) {
        super(statusCode, headers, rawHeaders, body);
    }

    /**
     * @return the deserialized response headers.
     */
    @Override
    public LROSADsDelete202RetryInvalidHeaderHeadersInner headers() {
        return super.headers();
    }
}
