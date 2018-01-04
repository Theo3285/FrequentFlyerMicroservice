package com.frequentflyer.usecases;

import org.springframework.stereotype.Component;

@Component
public class AuthenticateFrequentFlyerMember {

    public boolean knownAs(String memberName) {
        throw new UnsupportedOperationException();
    }

    public boolean isAuthorized(String memberName, String password) {
       throw new UnsupportedOperationException();
    }

    public boolean withActiveAccount(String memberName) {
        throw new UnsupportedOperationException();
    }
}
