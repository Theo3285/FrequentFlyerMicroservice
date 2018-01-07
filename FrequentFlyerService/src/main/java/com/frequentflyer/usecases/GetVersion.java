package com.frequentflyer.usecases;

import org.springframework.stereotype.Service;

@Service
public class GetVersion {

    public String handle() {
        return "1.0";
    }
}
