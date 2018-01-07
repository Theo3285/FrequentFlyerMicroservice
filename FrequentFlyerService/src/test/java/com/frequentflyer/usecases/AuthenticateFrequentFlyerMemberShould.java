package com.frequentflyer.usecases;

import com.frequentflyer.domain.repositories.FrequentFlyerMemberRepository;
import com.frequentflyer.usecases.gateways.AuthenticationGateway;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class AuthenticateFrequentFlyerMemberShould {

    public static final String EXISTING_USER = "Joe";
    public static final String VALID_PASSWORD = "secret";

    @Mock
    FrequentFlyerMemberRepository frequentFlyerMemberRepository;
    @Mock
    AuthenticationGateway authenticationGateway;

    private AuthenticateFrequentFlyerMember authenticateFrequentFlyerMember;

    @Before
    public void initialise() {
        authenticateFrequentFlyerMember = new AuthenticateFrequentFlyerMember(frequentFlyerMemberRepository, authenticationGateway);
    }

    @Test
    public void verify_a_member_exists() {

        authenticateFrequentFlyerMember.knownAs(EXISTING_USER);

        verify(frequentFlyerMemberRepository).existsByName(EXISTING_USER);
    }

    @Test
    public void authorize_an_existing_user() {

        authenticateFrequentFlyerMember.isAuthorized(EXISTING_USER, VALID_PASSWORD);

        verify(authenticationGateway).authenticate(EXISTING_USER, VALID_PASSWORD);
    }

    @Test
    public void verify_an_account_is_active() {

        authenticateFrequentFlyerMember.withActiveAccount(EXISTING_USER);

        verify(frequentFlyerMemberRepository).isActiveAccount(EXISTING_USER);
    }

}