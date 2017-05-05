package com.cloudaware.cloudmine.amazon.cloudformation;

import com.amazonaws.services.cloudformation.model.StackResourceDetail;
import com.cloudaware.cloudmine.amazon.AmazonException;
import com.cloudaware.cloudmine.amazon.AmazonResponse;

/**
 * User: urmuzov
 * Date: 03.20.17
 * Time: 15:45
 */
public final class StackResourceResponse extends AmazonResponse {
    private StackResourceDetail stackResource;

    public StackResourceResponse() {
    }

    public StackResourceResponse(final AmazonException exception) {
        super(exception);
    }

    public StackResourceResponse(final StackResourceDetail stackResource) {
        this.stackResource = stackResource;
    }

    public StackResourceDetail getStackResource() {
        return stackResource;
    }

    public void setStackResource(final StackResourceDetail stackResource) {
        this.stackResource = stackResource;
    }
}
