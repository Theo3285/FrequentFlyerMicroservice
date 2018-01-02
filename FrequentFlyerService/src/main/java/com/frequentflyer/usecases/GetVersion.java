package com.frequentflyer.usecases;

import org.springframework.stereotype.Component;

@Component
public class GetVersion {

    public String handle() {
        return "1.0";
    }
}
