package com.cloudaware.cloudmine.amazon.kms;

import com.cloudaware.cloudmine.amazon.AmazonException;
import com.cloudaware.cloudmine.amazon.AmazonResponse;

/**
 * User: urmuzov
 * Date: 03.23.17
 * Time: 17:28
 */
public final class PolicyResponse extends AmazonResponse {
    private String policy;

    public PolicyResponse() {
    }

    public PolicyResponse(final AmazonException exception) {
        super(exception);
    }

    public PolicyResponse(final String policy) {
        this.policy = policy;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(final String policy) {
        this.policy = policy;
    }
}
