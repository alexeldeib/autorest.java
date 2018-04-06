/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodydatetimerfc1123;

import com.microsoft.rest.v2.BodyResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.VoidResponse;
import fixtures.bodydatetimerfc1123.models.ErrorException;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Single;
import io.reactivex.annotations.NonNull;
import org.threeten.bp.OffsetDateTime;

/**
 * An instance of this class provides access to all the operations defined in
 * Datetimerfc1123s.
 */
public interface Datetimerfc1123s {
    /**
     * Get null datetime value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the OffsetDateTime object if successful.
     */
    OffsetDateTime getNull();

    /**
     * Get null datetime value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<OffsetDateTime> getNullAsync(ServiceCallback<OffsetDateTime> serviceCallback);

    /**
     * Get null datetime value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<BodyResponse<OffsetDateTime>> getNullWithRestResponseAsync();

    /**
     * Get null datetime value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<OffsetDateTime> getNullAsync();

    /**
     * Get invalid datetime value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the OffsetDateTime object if successful.
     */
    OffsetDateTime getInvalid();

    /**
     * Get invalid datetime value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<OffsetDateTime> getInvalidAsync(ServiceCallback<OffsetDateTime> serviceCallback);

    /**
     * Get invalid datetime value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<BodyResponse<OffsetDateTime>> getInvalidWithRestResponseAsync();

    /**
     * Get invalid datetime value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<OffsetDateTime> getInvalidAsync();

    /**
     * Get overflow datetime value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the OffsetDateTime object if successful.
     */
    OffsetDateTime getOverflow();

    /**
     * Get overflow datetime value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<OffsetDateTime> getOverflowAsync(ServiceCallback<OffsetDateTime> serviceCallback);

    /**
     * Get overflow datetime value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<BodyResponse<OffsetDateTime>> getOverflowWithRestResponseAsync();

    /**
     * Get overflow datetime value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<OffsetDateTime> getOverflowAsync();

    /**
     * Get underflow datetime value.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the OffsetDateTime object if successful.
     */
    OffsetDateTime getUnderflow();

    /**
     * Get underflow datetime value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<OffsetDateTime> getUnderflowAsync(ServiceCallback<OffsetDateTime> serviceCallback);

    /**
     * Get underflow datetime value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<BodyResponse<OffsetDateTime>> getUnderflowWithRestResponseAsync();

    /**
     * Get underflow datetime value.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<OffsetDateTime> getUnderflowAsync();

    /**
     * Put max datetime value Fri, 31 Dec 9999 23:59:59 GMT.
     *
     * @param datetimeBody the OffsetDateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putUtcMaxDateTime(@NonNull OffsetDateTime datetimeBody);

    /**
     * Put max datetime value Fri, 31 Dec 9999 23:59:59 GMT.
     *
     * @param datetimeBody the OffsetDateTime value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> putUtcMaxDateTimeAsync(@NonNull OffsetDateTime datetimeBody, ServiceCallback<Void> serviceCallback);

    /**
     * Put max datetime value Fri, 31 Dec 9999 23:59:59 GMT.
     *
     * @param datetimeBody the OffsetDateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<VoidResponse> putUtcMaxDateTimeWithRestResponseAsync(@NonNull OffsetDateTime datetimeBody);

    /**
     * Put max datetime value Fri, 31 Dec 9999 23:59:59 GMT.
     *
     * @param datetimeBody the OffsetDateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable putUtcMaxDateTimeAsync(@NonNull OffsetDateTime datetimeBody);

    /**
     * Get max datetime value fri, 31 dec 9999 23:59:59 gmt.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the OffsetDateTime object if successful.
     */
    OffsetDateTime getUtcLowercaseMaxDateTime();

    /**
     * Get max datetime value fri, 31 dec 9999 23:59:59 gmt.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<OffsetDateTime> getUtcLowercaseMaxDateTimeAsync(ServiceCallback<OffsetDateTime> serviceCallback);

    /**
     * Get max datetime value fri, 31 dec 9999 23:59:59 gmt.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<BodyResponse<OffsetDateTime>> getUtcLowercaseMaxDateTimeWithRestResponseAsync();

    /**
     * Get max datetime value fri, 31 dec 9999 23:59:59 gmt.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<OffsetDateTime> getUtcLowercaseMaxDateTimeAsync();

    /**
     * Get max datetime value FRI, 31 DEC 9999 23:59:59 GMT.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the OffsetDateTime object if successful.
     */
    OffsetDateTime getUtcUppercaseMaxDateTime();

    /**
     * Get max datetime value FRI, 31 DEC 9999 23:59:59 GMT.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<OffsetDateTime> getUtcUppercaseMaxDateTimeAsync(ServiceCallback<OffsetDateTime> serviceCallback);

    /**
     * Get max datetime value FRI, 31 DEC 9999 23:59:59 GMT.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<BodyResponse<OffsetDateTime>> getUtcUppercaseMaxDateTimeWithRestResponseAsync();

    /**
     * Get max datetime value FRI, 31 DEC 9999 23:59:59 GMT.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<OffsetDateTime> getUtcUppercaseMaxDateTimeAsync();

    /**
     * Put min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @param datetimeBody the OffsetDateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void putUtcMinDateTime(@NonNull OffsetDateTime datetimeBody);

    /**
     * Put min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @param datetimeBody the OffsetDateTime value.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<Void> putUtcMinDateTimeAsync(@NonNull OffsetDateTime datetimeBody, ServiceCallback<Void> serviceCallback);

    /**
     * Put min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @param datetimeBody the OffsetDateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Single<VoidResponse> putUtcMinDateTimeWithRestResponseAsync(@NonNull OffsetDateTime datetimeBody);

    /**
     * Put min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @param datetimeBody the OffsetDateTime value.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    Completable putUtcMinDateTimeAsync(@NonNull OffsetDateTime datetimeBody);

    /**
     * Get min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the OffsetDateTime object if successful.
     */
    OffsetDateTime getUtcMinDateTime();

    /**
     * Get min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    ServiceFuture<OffsetDateTime> getUtcMinDateTimeAsync(ServiceCallback<OffsetDateTime> serviceCallback);

    /**
     * Get min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Single<BodyResponse<OffsetDateTime>> getUtcMinDateTimeWithRestResponseAsync();

    /**
     * Get min datetime value Mon, 1 Jan 0001 00:00:00 GMT.
     *
     * @return a Single which performs the network request upon subscription.
     */
    Maybe<OffsetDateTime> getUtcMinDateTimeAsync();
}
