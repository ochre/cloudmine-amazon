package com.cloudaware.cloudmine.amazon.route53;

import com.amazonaws.services.route53.model.ResourceRecordSet;
import com.cloudaware.cloudmine.amazon.AmazonException;
import com.cloudaware.cloudmine.amazon.AmazonResponse;

import java.util.List;

/**
 * User: urmuzov
 * Date: 03.23.17
 * Time: 20:56
 */
public final class ResourceRecordSetsResponse extends AmazonResponse {
    private List<ResourceRecordSet> resourceRecordSets;

    public ResourceRecordSetsResponse() {
    }

    public ResourceRecordSetsResponse(final AmazonException exception) {
        super(exception);
    }

    public ResourceRecordSetsResponse(final List<ResourceRecordSet> resourceRecordSets, final String nextPage) {
        super(nextPage);
        this.resourceRecordSets = resourceRecordSets;
    }

    public List<ResourceRecordSet> getResourceRecordSets() {
        return resourceRecordSets;
    }

    public void setResourceRecordSets(final List<ResourceRecordSet> resourceRecordSets) {
        this.resourceRecordSets = resourceRecordSets;
    }
}
