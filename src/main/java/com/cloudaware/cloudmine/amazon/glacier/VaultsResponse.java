package com.cloudaware.cloudmine.amazon.glacier;

import com.amazonaws.services.glacier.model.DescribeVaultOutput;
import com.cloudaware.cloudmine.amazon.AmazonException;
import com.cloudaware.cloudmine.amazon.AmazonResponse;

import java.util.List;

/**
 * User: urmuzov
 * Date: 03.22.17
 * Time: 22:50
 */
public final class VaultsResponse extends AmazonResponse {
    private List<DescribeVaultOutput> vaults;

    public VaultsResponse() {
    }

    public VaultsResponse(final AmazonException exception) {
        super(exception);
    }

    public VaultsResponse(final List<DescribeVaultOutput> vaults, final String nextPage) {
        super(nextPage);
        this.vaults = vaults;
    }

    public List<DescribeVaultOutput> getVaults() {
        return vaults;
    }

    public void setVaults(final List<DescribeVaultOutput> vaults) {
        this.vaults = vaults;
    }
}
