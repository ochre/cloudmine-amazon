package com.cloudaware.cloudmine.amazon.kms;

import com.amazonaws.services.kms.model.GrantListEntry;
import com.cloudaware.cloudmine.amazon.AmazonException;
import com.cloudaware.cloudmine.amazon.AmazonResponse;

import java.util.List;

/**
 * User: urmuzov
 * Date: 03.23.17
 * Time: 17:25
 */
public final class GrantsResponse extends AmazonResponse {
    private List<GrantListEntry> grants;

    public GrantsResponse() {
    }

    public GrantsResponse(final AmazonException exception) {
        super(exception);
    }

    public GrantsResponse(final List<GrantListEntry> grants, final String nextPage) {
        super(nextPage);
        this.grants = grants;
    }

    public List<GrantListEntry> getGrants() {
        return grants;
    }

    public void setGrants(final List<GrantListEntry> grants) {
        this.grants = grants;
    }
}
