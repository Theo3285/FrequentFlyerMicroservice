package com.frequentflyer.domain.repositories;

public interface FrequentFlyerMemberRepository {

    boolean existsByName(String name);

    boolean isActiveAccount(String name);

    void addMember(String name);
}
