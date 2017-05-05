package com.cloudaware.cloudmine.amazon.iam;

import com.amazonaws.services.identitymanagement.model.SigningCertificate;
import com.cloudaware.cloudmine.amazon.AmazonException;
import com.cloudaware.cloudmine.amazon.AmazonResponse;

import java.util.List;

/**
 * User: urmuzov
 * Date: 03.23.17
 * Time: 04:09
 */
public final class SigningCertificatesResponse extends AmazonResponse {
    private List<SigningCertificate> signingCertificates;

    public SigningCertificatesResponse() {
    }

    public SigningCertificatesResponse(final AmazonException exception) {
        super(exception);
    }

    public SigningCertificatesResponse(final List<SigningCertificate> signingCertificates, final String nextPage) {
        super(nextPage);
        this.signingCertificates = signingCertificates;
    }

    public List<SigningCertificate> getSigningCertificates() {
        return signingCertificates;
    }

    public void setSigningCertificates(final List<SigningCertificate> signingCertificates) {
        this.signingCertificates = signingCertificates;
    }
}
