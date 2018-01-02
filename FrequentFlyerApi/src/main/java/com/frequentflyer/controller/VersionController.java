package com.frequentflyer.controller;

import com.frequentflyer.usecases.GetVersion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {

    @Autowired
    private GetVersion getVersion;

    @RequestMapping(method={RequestMethod.GET},value={"/version"})
    public String getVersion() {
        return getVersion.handle();
    }
}
