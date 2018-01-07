package com.frequentflyer.adapters.repositories;

import com.frequentflyer.domain.FrequentFlyerMember;
import com.frequentflyer.domain.repositories.FrequentFlyerMemberRepository;

import java.util.ArrayList;
import java.util.List;

public class InMemoryFrequentFlyerMemberRepository implements FrequentFlyerMemberRepository {

    private List<FrequentFlyerMember> members = new ArrayList<>();

    @Override
    public boolean existsByName(String name) {
        return members.stream()
                .anyMatch(m -> name.equals(m.getName()));
    }

    @Override
    public boolean isActiveAccount(String name) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void addMember(String name) {
        this.members.add(new FrequentFlyerMember(name));
    }
}
