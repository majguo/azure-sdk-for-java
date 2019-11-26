/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2018_05_01.implementation;

import com.microsoft.azure.management.resources.v2018_05_01.DeploymentExportResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class DeploymentExportResultImpl extends WrapperImpl<DeploymentExportResultInner> implements DeploymentExportResult {
    private final ResourcesManager manager;
    DeploymentExportResultImpl(DeploymentExportResultInner inner, ResourcesManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ResourcesManager manager() {
        return this.manager;
    }

    @Override
    public Object template() {
        return this.inner().template();
    }

}