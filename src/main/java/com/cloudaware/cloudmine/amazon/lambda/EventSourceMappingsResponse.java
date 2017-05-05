package com.cloudaware.cloudmine.amazon.lambda;

import com.amazonaws.services.lambda.model.EventSourceMappingConfiguration;
import com.cloudaware.cloudmine.amazon.AmazonException;
import com.cloudaware.cloudmine.amazon.AmazonResponse;

import java.util.List;

/**
 * User: urmuzov
 * Date: 03.23.17
 * Time: 18:29
 */
public final class EventSourceMappingsResponse extends AmazonResponse {
    private List<EventSourceMappingConfiguration> eventSourceMappings;

    public EventSourceMappingsResponse() {
    }

    public EventSourceMappingsResponse(final AmazonException exception) {
        super(exception);
    }

    public EventSourceMappingsResponse(final List<EventSourceMappingConfiguration> eventSourceMappings, final String nextPage) {
        super(nextPage);
        this.eventSourceMappings = eventSourceMappings;
    }

    public List<EventSourceMappingConfiguration> getEventSourceMappings() {
        return eventSourceMappings;
    }

    public void setEventSourceMappings(final List<EventSourceMappingConfiguration> eventSourceMappings) {
        this.eventSourceMappings = eventSourceMappings;
    }
}
