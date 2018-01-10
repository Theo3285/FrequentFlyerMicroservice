package com.frequentflyer.controller;

import com.frequentflyer.usecases.CreateFrequentFlyerMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateMembersController {

    @Autowired
    private CreateFrequentFlyerMember createFrequentFlyerMember;

    @PostMapping(value = "/members", consumes = "application/json")
    public ResponseEntity createMembers(@RequestBody String body) {
        throw new UnsupportedOperationException();
    }
}
