package com.cloudaware.cloudmine.amazon.lambda;

import com.amazonaws.services.lambda.model.AliasConfiguration;
import com.cloudaware.cloudmine.amazon.AmazonException;
import com.cloudaware.cloudmine.amazon.AmazonResponse;

import java.util.List;

/**
 * User: urmuzov
 * Date: 03.23.17
 * Time: 17:52
 */
public final class AliasesResponse extends AmazonResponse {
    private List<AliasConfiguration> aliases;

    public AliasesResponse() {
    }

    public AliasesResponse(final AmazonException exception) {
        super(exception);
    }

    public AliasesResponse(final List<AliasConfiguration> aliases, final String nextPage) {
        super(nextPage);
        this.aliases = aliases;
    }

    public List<AliasConfiguration> getAliases() {
        return aliases;
    }

    public void setAliases(final List<AliasConfiguration> aliases) {
        this.aliases = aliases;
    }
}
