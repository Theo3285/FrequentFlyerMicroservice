package com.frequentflyer.adapters.repositories;

import com.frequentflyer.domain.repositories.FrequentFlyerMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepositoriesConfiguration {
    @Bean
    public FrequentFlyerMemberRepository frequentFlyerMemberRepository() {
        return new InMemoryFrequentFlyerMemberRepository();
    }
}
