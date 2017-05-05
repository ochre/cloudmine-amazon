package com.cloudaware.cloudmine.amazon.elasticache;

import com.cloudaware.cloudmine.amazon.AmazonException;
import com.cloudaware.cloudmine.amazon.AmazonResponse;

import java.util.Map;

/**
 * User: urmuzov
 * Date: 03.21.17
 * Time: 15:37
 */
public final class TagsResponse extends AmazonResponse {
    private Map<String, String> tags;

    public TagsResponse() {
    }

    public TagsResponse(final AmazonException exception) {
        super(exception);
    }

    public TagsResponse(final Map<String, String> tags) {
        this.tags = tags;
    }

    public Map<String, String> getTags() {
        return tags;
    }

    public void setTags(final Map<String, String> tags) {
        this.tags = tags;
    }
}
