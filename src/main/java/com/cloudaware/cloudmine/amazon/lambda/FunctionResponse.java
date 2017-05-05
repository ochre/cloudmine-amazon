package com.cloudaware.cloudmine.amazon.lambda;

import com.amazonaws.services.lambda.model.FunctionCodeLocation;
import com.amazonaws.services.lambda.model.FunctionConfiguration;
import com.cloudaware.cloudmine.amazon.AmazonException;
import com.cloudaware.cloudmine.amazon.AmazonResponse;

/**
 * User: urmuzov
 * Date: 03.23.17
 * Time: 17:45
 */
public final class FunctionResponse extends AmazonResponse {
    private FunctionConfiguration configuration;
    private FunctionCodeLocation code;

    public FunctionResponse() {
    }

    public FunctionResponse(final AmazonException exception) {
        super(exception);
    }

    public FunctionResponse(final FunctionConfiguration configuration, final FunctionCodeLocation code) {
        this.configuration = configuration;
        this.code = code;
    }

    public FunctionConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(final FunctionConfiguration configuration) {
        this.configuration = configuration;
    }

    public FunctionCodeLocation getCode() {
        return code;
    }

    public void setCode(final FunctionCodeLocation code) {
        this.code = code;
    }
}
