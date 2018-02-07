/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.custombaseurimoreoptions.implementation;

import com.microsoft.rest.v2.RestProxy;
import com.microsoft.rest.v2.RestResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.HostParam;
import com.microsoft.rest.v2.annotations.PathParam;
import com.microsoft.rest.v2.annotations.QueryParam;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import fixtures.custombaseurimoreoptions.Paths;
import fixtures.custombaseurimoreoptions.models.ErrorException;
import io.reactivex.Completable;
import io.reactivex.Single;
import io.reactivex.annotations.NonNull;

/**
 * An instance of this class provides access to all the operations defined in
 * Paths.
 */
public final class PathsImpl implements Paths {
    /**
     * The proxy service used to perform REST calls.
     */
    private PathsService service;

    /**
     * The service client containing this operation class.
     */
    private AutoRestParameterizedCustomHostTestClientImpl client;

    /**
     * Initializes an instance of PathsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public PathsImpl(AutoRestParameterizedCustomHostTestClientImpl client) {
        this.service = RestProxy.create(PathsService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for Paths to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{vault}{secret}{dnsSuffix}")
    private interface PathsService {
        @GET("customuri/{subscriptionId}/{keyName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Single<RestResponse<Void, Void>> getEmpty(@HostParam("vault") String vault, @HostParam("secret") String secret, @HostParam("dnsSuffix") String dnsSuffix, @PathParam("keyName") String keyName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("keyVersion") String keyVersion);
    }

    /**
     * Get a 200 to test a valid base uri.
     *
     * @param vault The vault name, e.g. https://myvault.
     * @param secret Secret value.
     * @param keyName The key name with value 'key1'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void getEmpty(@NonNull String vault, @NonNull String secret, @NonNull String keyName) {
        getEmptyAsync(vault, secret, keyName).blockingAwait();
    }

    /**
     * Get a 200 to test a valid base uri.
     *
     * @param vault The vault name, e.g. https://myvault.
     * @param secret Secret value.
     * @param keyName The key name with value 'key1'.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    public ServiceFuture<Void> getEmptyAsync(@NonNull String vault, @NonNull String secret, @NonNull String keyName, @NonNull ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(getEmptyAsync(vault, secret, keyName), serviceCallback);
    }

    /**
     * Get a 200 to test a valid base uri.
     *
     * @param vault The vault name, e.g. https://myvault.
     * @param secret Secret value.
     * @param keyName The key name with value 'key1'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, Void>> getEmptyWithRestResponseAsync(@NonNull String vault, @NonNull String secret, @NonNull String keyName) {
        if (vault == null) {
            throw new IllegalArgumentException("Parameter vault is required and cannot be null.");
        }
        if (secret == null) {
            throw new IllegalArgumentException("Parameter secret is required and cannot be null.");
        }
        if (this.client.dnsSuffix() == null) {
            throw new IllegalArgumentException("Parameter this.client.dnsSuffix() is required and cannot be null.");
        }
        if (keyName == null) {
            throw new IllegalArgumentException("Parameter keyName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String keyVersion = null;
        return service.getEmpty(vault, secret, this.client.dnsSuffix(), keyName, this.client.subscriptionId(), keyVersion);
    }

    /**
     * Get a 200 to test a valid base uri.
     *
     * @param vault The vault name, e.g. https://myvault.
     * @param secret Secret value.
     * @param keyName The key name with value 'key1'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    public Completable getEmptyAsync(@NonNull String vault, @NonNull String secret, @NonNull String keyName) {
        return getEmptyWithRestResponseAsync(vault, secret, keyName)
            .toCompletable();
    }

    /**
     * Get a 200 to test a valid base uri.
     *
     * @param vault The vault name, e.g. https://myvault.
     * @param secret Secret value.
     * @param keyName The key name with value 'key1'.
     * @param keyVersion The key version. Default value 'v1'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void getEmpty(@NonNull String vault, @NonNull String secret, @NonNull String keyName, String keyVersion) {
        getEmptyAsync(vault, secret, keyName, keyVersion).blockingAwait();
    }

    /**
     * Get a 200 to test a valid base uri.
     *
     * @param vault The vault name, e.g. https://myvault.
     * @param secret Secret value.
     * @param keyName The key name with value 'key1'.
     * @param keyVersion The key version. Default value 'v1'.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link ServiceFuture&lt;Void&gt;} object.
     */
    public ServiceFuture<Void> getEmptyAsync(@NonNull String vault, @NonNull String secret, @NonNull String keyName, String keyVersion, @NonNull ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(getEmptyAsync(vault, secret, keyName, keyVersion), serviceCallback);
    }

    /**
     * Get a 200 to test a valid base uri.
     *
     * @param vault The vault name, e.g. https://myvault.
     * @param secret Secret value.
     * @param keyName The key name with value 'key1'.
     * @param keyVersion The key version. Default value 'v1'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Single&lt;RestResponse&lt;Void, Void&gt;&gt;} object if successful.
     */
    public Single<RestResponse<Void, Void>> getEmptyWithRestResponseAsync(@NonNull String vault, @NonNull String secret, @NonNull String keyName, String keyVersion) {
        if (vault == null) {
            throw new IllegalArgumentException("Parameter vault is required and cannot be null.");
        }
        if (secret == null) {
            throw new IllegalArgumentException("Parameter secret is required and cannot be null.");
        }
        if (this.client.dnsSuffix() == null) {
            throw new IllegalArgumentException("Parameter this.client.dnsSuffix() is required and cannot be null.");
        }
        if (keyName == null) {
            throw new IllegalArgumentException("Parameter keyName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        return service.getEmpty(vault, secret, this.client.dnsSuffix(), keyName, this.client.subscriptionId(), keyVersion);
    }

    /**
     * Get a 200 to test a valid base uri.
     *
     * @param vault The vault name, e.g. https://myvault.
     * @param secret Secret value.
     * @param keyName The key name with value 'key1'.
     * @param keyVersion The key version. Default value 'v1'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the {@link Completable} object if successful.
     */
    public Completable getEmptyAsync(@NonNull String vault, @NonNull String secret, @NonNull String keyName, String keyVersion) {
        return getEmptyWithRestResponseAsync(vault, secret, keyName, keyVersion)
            .toCompletable();
    }
}
