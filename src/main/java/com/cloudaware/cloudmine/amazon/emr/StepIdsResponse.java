package com.cloudaware.cloudmine.amazon.emr;

import com.cloudaware.cloudmine.amazon.AmazonException;
import com.cloudaware.cloudmine.amazon.AmazonResponse;

import java.util.List;

/**
 * User: urmuzov
 * Date: 03.22.17
 * Time: 18:02
 */
public final class StepIdsResponse extends AmazonResponse {
    private List<String> stepIds;

    public StepIdsResponse() {
    }

    public StepIdsResponse(final AmazonException exception) {
        super(exception);
    }

    public StepIdsResponse(final List<String> stepIds) {
        this.stepIds = stepIds;
    }

    public List<String> getStepIds() {
        return stepIds;
    }

    public void setStepIds(final List<String> stepIds) {
        this.stepIds = stepIds;
    }
}
