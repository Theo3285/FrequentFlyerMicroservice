package com.frequentflyer.adapters.gateways;

import com.frequentflyer.usecases.gateways.AuthenticationGateway;

public class InMemoryAuthenticationGateway implements AuthenticationGateway {
    @Override
    public boolean authenticate(String existingUser, String validPassword) {
        throw new UnsupportedOperationException();
    }
}
