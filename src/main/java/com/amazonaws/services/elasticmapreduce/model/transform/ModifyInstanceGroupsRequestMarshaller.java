/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticmapreduce.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.elasticmapreduce.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Modify Instance Groups Request Marshaller
 */
public class ModifyInstanceGroupsRequestMarshaller implements Marshaller<Request<ModifyInstanceGroupsRequest>, ModifyInstanceGroupsRequest> {

    public Request<ModifyInstanceGroupsRequest> marshall(ModifyInstanceGroupsRequest modifyInstanceGroupsRequest) {

        if (modifyInstanceGroupsRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<ModifyInstanceGroupsRequest> request = new DefaultRequest<ModifyInstanceGroupsRequest>(modifyInstanceGroupsRequest, "AmazonElasticMapReduce");
        request.addParameter("Action", "ModifyInstanceGroups");
        request.addParameter("Version", "2009-03-31");


        java.util.List<InstanceGroupModifyConfig> instanceGroupsList = modifyInstanceGroupsRequest.getInstanceGroups();
        int instanceGroupsListIndex = 1;

        for (InstanceGroupModifyConfig instanceGroupsListValue : instanceGroupsList) {
            InstanceGroupModifyConfig instanceGroupModifyConfigMember = instanceGroupsListValue;
            if (instanceGroupModifyConfigMember != null) {
                if (instanceGroupModifyConfigMember.getInstanceGroupId() != null) {
                    request.addParameter("InstanceGroups.member." + instanceGroupsListIndex + ".InstanceGroupId", StringUtils.fromString(instanceGroupModifyConfigMember.getInstanceGroupId()));
                }
                if (instanceGroupModifyConfigMember.getInstanceCount() != null) {
                    request.addParameter("InstanceGroups.member." + instanceGroupsListIndex + ".InstanceCount", StringUtils.fromInteger(instanceGroupModifyConfigMember.getInstanceCount()));
                }
            }

            instanceGroupsListIndex++;
        }


        return request;
    }
}
