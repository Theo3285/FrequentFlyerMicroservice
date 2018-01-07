package com.frequentflyer.adapters.gateways;

import com.frequentflyer.usecases.gateways.AuthenticationGateway;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewaysConfiguration {
    @Bean
    public AuthenticationGateway authenticationGateway() {
        return new InMemoryAuthenticationGateway();
    }
}
