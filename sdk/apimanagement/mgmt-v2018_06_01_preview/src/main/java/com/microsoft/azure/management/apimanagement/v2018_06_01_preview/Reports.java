/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview;

import rx.Observable;
import org.joda.time.Period;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation.ReportsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Reports.
 */
public interface Reports extends HasInner<ReportsInner> {
    /**
     * Lists report records by API.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param filter The filter to apply on the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ReportRecordContract> listByApiAsync(final String resourceGroupName, final String serviceName, final String filter);

    /**
     * Lists report records by User.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param filter The filter to apply on the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ReportRecordContract> listByUserAsync(final String resourceGroupName, final String serviceName, final String filter);

    /**
     * Lists report records by API Operations.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param filter The filter to apply on the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ReportRecordContract> listByOperationAsync(final String resourceGroupName, final String serviceName, final String filter);

    /**
     * Lists report records by Product.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param filter The filter to apply on the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ReportRecordContract> listByProductAsync(final String resourceGroupName, final String serviceName, final String filter);

    /**
     * Lists report records by geography.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ReportRecordContract> listByGeoAsync(final String resourceGroupName, final String serviceName);

    /**
     * Lists report records by subscription.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ReportRecordContract> listBySubscriptionAsync(final String resourceGroupName, final String serviceName);

    /**
     * Lists report records by Time.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param interval By time interval. Interval must be multiple of 15 minutes and may not be zero. The value should be in ISO  8601 format (http://en.wikipedia.org/wiki/ISO_8601#Durations).This code can be used to convert TimeSpan to a valid interval string: XmlConvert.ToString(new TimeSpan(hours, minutes, seconds))
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ReportRecordContract> listByTimeAsync(final String resourceGroupName, final String serviceName, final Period interval);

    /**
     * Lists report records by Request.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param filter The filter to apply on the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RequestReportRecordContract> listByRequestAsync(String resourceGroupName, String serviceName, String filter);

}