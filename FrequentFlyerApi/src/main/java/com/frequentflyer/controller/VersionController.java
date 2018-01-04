package com.frequentflyer.controller;

import com.frequentflyer.usecases.GetVersion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {

    @Autowired
    private GetVersion getVersion;

    @GetMapping("/version")
    @ResponseStatus(HttpStatus.OK)
    public String getVersion() {
        return getVersion.handle();
    }
}
