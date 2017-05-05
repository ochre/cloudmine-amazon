package com.cloudaware.cloudmine.amazon.cloudfront;

import com.amazonaws.services.cloudfront.model.DistributionSummary;
import com.cloudaware.cloudmine.amazon.AmazonException;
import com.cloudaware.cloudmine.amazon.AmazonResponse;

import java.util.List;

/**
 * User: urmuzov
 * Date: 03.20.17
 * Time: 15:59
 */
public final class DistributionsResponse extends AmazonResponse {
    private List<DistributionSummary> distributions;

    public DistributionsResponse() {
    }

    public DistributionsResponse(final AmazonException exception) {
        super(exception);
    }

    public DistributionsResponse(final List<DistributionSummary> distributions, final String nextPage) {
        super(nextPage);
        this.distributions = distributions;
    }

    public List<DistributionSummary> getDistributions() {
        return distributions;
    }

    public void setDistributions(final List<DistributionSummary> distributions) {
        this.distributions = distributions;
    }
}
