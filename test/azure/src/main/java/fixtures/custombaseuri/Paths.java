/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.custombaseuri;

import com.microsoft.rest.RestResponse;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import fixtures.custombaseuri.models.ErrorException;
import java.io.IOException;
import rx.Observable;
import rx.Single;

/**
 * An instance of this class provides access to all the operations defined
 * in Paths.
 */
public interface Paths {
    /**
     * Get a 200 to test a valid base uri.
     *
     * @param accountName Account Name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void getEmpty(String accountName);

    /**
     * Get a 200 to test a valid base uri.
     *
     * @param accountName Account Name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> getEmptyAsync(String accountName, final ServiceCallback<Void> serviceCallback);

    /**
     * Get a 200 to test a valid base uri.
     *
     * @param accountName Account Name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link Single<Void>} object if successful.
     */
    Single<Void> getEmptyAsync(String accountName);

    /**
     * Get a 200 to test a valid base uri.
     *
     * @param accountName Account Name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link RestResponse<Void, Void>} object if successful.
     */
    Single<RestResponse<Void, Void>> getEmptyWithRestResponseAsync(String accountName);


}
