package com.cloudaware.cloudmine.amazon.elbv2;

import com.amazonaws.services.elasticloadbalancingv2.model.LoadBalancer;
import com.cloudaware.cloudmine.amazon.AmazonResponse;

import java.util.List;

public final class LoadBalancersResponse extends AmazonResponse {

    private List<LoadBalancer> loadBalancers;

    public List<LoadBalancer> getLoadBalancers() {
        return loadBalancers;
    }

    public void setLoadBalancers(final List<LoadBalancer> loadBalancers) {
        this.loadBalancers = loadBalancers;
    }
}
