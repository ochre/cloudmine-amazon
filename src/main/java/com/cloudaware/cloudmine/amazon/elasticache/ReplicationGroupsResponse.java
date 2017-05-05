package com.cloudaware.cloudmine.amazon.elasticache;

import com.amazonaws.services.elasticache.model.ReplicationGroup;
import com.cloudaware.cloudmine.amazon.AmazonException;
import com.cloudaware.cloudmine.amazon.AmazonResponse;

import java.util.List;

/**
 * User: urmuzov
 * Date: 03.21.17
 * Time: 15:31
 */
public final class ReplicationGroupsResponse extends AmazonResponse {
    private List<ReplicationGroup> replicationGroups;

    public ReplicationGroupsResponse() {
    }

    public ReplicationGroupsResponse(final AmazonException exception) {
        super(exception);
    }

    public ReplicationGroupsResponse(final List<ReplicationGroup> replicationGroups, final String nextPage) {
        super(nextPage);
        this.replicationGroups = replicationGroups;
    }

    public List<ReplicationGroup> getReplicationGroups() {
        return replicationGroups;
    }

    public void setReplicationGroups(final List<ReplicationGroup> replicationGroups) {
        this.replicationGroups = replicationGroups;
    }
}
