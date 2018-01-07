package com.frequentflyer.usecases.gateways;

public interface AuthenticationGateway {
    boolean authenticate(String existingUser, String validPassword);
}
