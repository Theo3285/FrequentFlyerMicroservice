package com.frequentflyer.usecases;

import com.frequentflyer.domain.repositories.FrequentFlyerMemberRepository;
import com.frequentflyer.usecases.gateways.AuthenticationGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticateFrequentFlyerMember {

    private final FrequentFlyerMemberRepository frequentFlyerMemberRepository;
    private final AuthenticationGateway authenticationGateway;

    @Autowired
    public AuthenticateFrequentFlyerMember(
            FrequentFlyerMemberRepository frequentFlyerMemberRepository,
            AuthenticationGateway authenticationGateway) {
        this.frequentFlyerMemberRepository = frequentFlyerMemberRepository;
        this.authenticationGateway = authenticationGateway;
    }

    public boolean knownAs(String memberName) {
        return frequentFlyerMemberRepository.existsByName(memberName);
    }

    public boolean isAuthorized(String memberName, String password) {
        return authenticationGateway.authenticate(memberName, password);
    }

    public boolean withActiveAccount(String memberName) {
        return frequentFlyerMemberRepository.isActiveAccount(memberName);
    }
}
