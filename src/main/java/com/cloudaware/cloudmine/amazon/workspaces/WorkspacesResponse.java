package com.cloudaware.cloudmine.amazon.workspaces;

import com.amazonaws.services.workspaces.model.Workspace;
import com.cloudaware.cloudmine.amazon.AmazonException;
import com.cloudaware.cloudmine.amazon.AmazonResponse;

import java.util.List;

/**
 * User: urmuzov
 * Date: 03.24.17
 * Time: 03:45
 */
public final class WorkspacesResponse extends AmazonResponse {
    private List<Workspace> workspaces;

    public WorkspacesResponse() {
    }

    public WorkspacesResponse(final AmazonException exception) {
        super(exception);
    }

    public WorkspacesResponse(final List<Workspace> workspaces, final String nextPage) {
        super(nextPage);
        this.workspaces = workspaces;
    }

    public List<Workspace> getWorkspaces() {
        return workspaces;
    }

    public void setWorkspaces(final List<Workspace> workspaces) {
        this.workspaces = workspaces;
    }
}
