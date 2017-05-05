package com.cloudaware.cloudmine.amazon.cloudfront;

import com.amazonaws.services.cloudfront.model.InvalidationSummary;
import com.cloudaware.cloudmine.amazon.AmazonException;
import com.cloudaware.cloudmine.amazon.AmazonResponse;

import java.util.List;

/**
 * User: urmuzov
 * Date: 03.20.17
 * Time: 16:34
 */
public final class InvalidationsResponse extends AmazonResponse {
    private List<InvalidationSummary> invalidationSummaries;

    public InvalidationsResponse() {
    }

    public InvalidationsResponse(final AmazonException exception) {
        super(exception);
    }

    public InvalidationsResponse(final List<InvalidationSummary> invalidationSummaries, final String nextPage) {
        super(nextPage);
        this.invalidationSummaries = invalidationSummaries;
    }

    public List<InvalidationSummary> getInvalidationSummaries() {
        return invalidationSummaries;
    }

    public void setInvalidationSummaries(final List<InvalidationSummary> invalidationSummaries) {
        this.invalidationSummaries = invalidationSummaries;
    }
}
