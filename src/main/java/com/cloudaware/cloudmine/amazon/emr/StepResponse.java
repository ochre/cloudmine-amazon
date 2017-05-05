package com.cloudaware.cloudmine.amazon.emr;

import com.amazonaws.services.elasticmapreduce.model.Step;
import com.cloudaware.cloudmine.amazon.AmazonException;
import com.cloudaware.cloudmine.amazon.AmazonResponse;

/**
 * User: urmuzov
 * Date: 03.22.17
 * Time: 18:02
 */
public final class StepResponse extends AmazonResponse {
    private Step step;

    public StepResponse() {
    }

    public StepResponse(final AmazonException exception) {
        super(exception);
    }

    public StepResponse(final Step step) {
        this.step = step;
    }

    public Step getStep() {
        return step;
    }

    public void setStep(final Step step) {
        this.step = step;
    }
}
