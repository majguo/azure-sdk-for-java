/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.v2;

import com.microsoft.rest.v2.RestProxy;
import com.microsoft.rest.v2.SwaggerMethodParser;
import com.microsoft.rest.v2.http.HttpRequest;
import com.microsoft.rest.v2.http.HttpResponse;
import rx.Single;
import rx.functions.Func1;

import java.io.IOException;

/**
 * A PollStrategy that will continue to poll a resource's URL until the resource's provisioning
 * state property is in a completed state.
 */
public class ProvisioningStatePollStrategy extends PollStrategy {
    private final HttpRequest originalRequest;

    ProvisioningStatePollStrategy(RestProxy restProxy, SwaggerMethodParser methodParser, HttpRequest originalRequest, String provisioningState, long delayInMilliseconds) {
        super(restProxy, methodParser, delayInMilliseconds);

        this.originalRequest = originalRequest;
        setStatus(provisioningState);
    }

    @Override
    HttpRequest createPollRequest() {
        return new HttpRequest(originalRequest.callerMethod(), "GET", originalRequest.url());
    }

    @Override
    Single<HttpResponse> updateFromAsync(HttpResponse httpPollResponse) {
        return ensureExpectedStatus(httpPollResponse)
                .flatMap(new Func1<HttpResponse, Single<HttpResponse>>() {
                    @Override
                    public Single<HttpResponse> call(HttpResponse response) {
                        final HttpResponse bufferedHttpPollResponse = response.buffer();
                        return bufferedHttpPollResponse.bodyAsStringAsync()
                                .map(new Func1<String, HttpResponse>() {
                                    @Override
                                    public HttpResponse call(String responseBody) {
                                            ResourceWithProvisioningState resource = null;
                                            try {
                                                resource = deserialize(responseBody, ResourceWithProvisioningState.class);
                                            } catch (IOException ignored) {
                                            }

                                            if (resource == null || resource.properties() == null || resource.properties().provisioningState() == null) {
                                                throw new CloudException("The polling response does not contain a valid body", bufferedHttpPollResponse, null);
                                            }
                                            else if (OperationState.isFailedOrCanceled(resource.properties().provisioningState())) {
                                                throw new CloudException("Async operation failed with provisioning state: " + resource.properties().provisioningState(), bufferedHttpPollResponse);
                                            }
                                            else {
                                                setStatus(resource.properties().provisioningState());
                                            }
                                        return bufferedHttpPollResponse;
                                    }
                                });
                    }
                });

    }

    @Override
    boolean isDone() {
        return OperationState.isCompleted(status());
    }
}