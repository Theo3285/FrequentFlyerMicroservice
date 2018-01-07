package com.frequentflyer.domain;

import java.util.Objects;

public class FrequentFlyerMember {

    private String name;

    public FrequentFlyerMember(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FrequentFlyerMember that = (FrequentFlyerMember) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }

}
