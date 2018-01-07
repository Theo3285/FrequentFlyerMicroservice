package com.frequentflyer.domain.repositories;

import com.frequentflyer.adapters.repositories.InMemoryFrequentFlyerMemberRepository;
import com.frequentflyer.domain.FrequentFlyerMember;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FrequentFlyerMemberRepositoryShould {

    public static final String EXISTING_MEMBER = "Joe";

    private FrequentFlyerMemberRepository frequentFlyerMemberRepository;

    @Before
    public void initialise() {
        frequentFlyerMemberRepository = new InMemoryFrequentFlyerMemberRepository();
    }

    @Test
    public void find_a_existing_member() {

        frequentFlyerMemberRepository.addMember(EXISTING_MEMBER);

        assertTrue(frequentFlyerMemberRepository.existsByName(EXISTING_MEMBER));
    }

}