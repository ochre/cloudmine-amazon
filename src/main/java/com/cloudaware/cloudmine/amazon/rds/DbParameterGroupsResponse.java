package com.cloudaware.cloudmine.amazon.rds;

import com.amazonaws.services.rds.model.DBParameterGroup;
import com.cloudaware.cloudmine.amazon.AmazonException;
import com.cloudaware.cloudmine.amazon.AmazonResponse;

import java.util.List;

/**
 * User: urmuzov
 * Date: 03.23.17
 * Time: 19:21
 */
public final class DbParameterGroupsResponse extends AmazonResponse {
    private List<DBParameterGroup> dbParameterGroups;

    public DbParameterGroupsResponse() {
    }

    public DbParameterGroupsResponse(final AmazonException exception) {
        super(exception);
    }

    public DbParameterGroupsResponse(final List<DBParameterGroup> dbParameterGroups, final String nextPage) {
        super(nextPage);
        this.dbParameterGroups = dbParameterGroups;
    }

    public List<DBParameterGroup> getDbParameterGroups() {
        return dbParameterGroups;
    }

    public void setDbParameterGroups(final List<DBParameterGroup> dbParameterGroups) {
        this.dbParameterGroups = dbParameterGroups;
    }
}
