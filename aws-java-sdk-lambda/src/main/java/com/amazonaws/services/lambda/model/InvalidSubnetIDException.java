/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.lambda.model;

/**
 * <p>
 * The Subnet ID provided in the Lambda function VPC configuration is invalid.
 * </p>
 */
public class InvalidSubnetIDException extends com.amazonaws.services.lambda.model.AWSLambdaException {
    private static final long serialVersionUID = 1L;

    private String type;

    /**
     * Constructs a new InvalidSubnetIDException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidSubnetIDException(String message) {
        super(message);
    }

    /**
     * @param type
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return
     */

    @com.fasterxml.jackson.annotation.JsonProperty("Type")
    public String getType() {
        return this.type;
    }

    /**
     * @param type
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InvalidSubnetIDException withType(String type) {
        setType(type);
        return this;
    }

}
