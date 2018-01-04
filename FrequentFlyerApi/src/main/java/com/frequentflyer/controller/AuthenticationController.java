package com.frequentflyer.controller;

import com.frequentflyer.controller.exception.AccountExpiredException;
import com.frequentflyer.controller.exception.UnauthorizedMemberException;
import com.frequentflyer.controller.exception.UnknownMemberException;
import com.frequentflyer.usecases.AuthenticateFrequentFlyerMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    @Autowired
    private AuthenticateFrequentFlyerMember authenticateFrequentFlyerMember;

    @GetMapping("/member")
    public ResponseEntity<?> authenticateFrequentFlyerMember(
            @RequestParam("name") String memberName,
            @RequestParam("password") String password) {
            if (!authenticateFrequentFlyerMember.knownAs(memberName))
                throw new UnknownMemberException("Not a Frequent Flyer Member");
            if (!authenticateFrequentFlyerMember.isAuthorized(memberName, password))
                throw new UnauthorizedMemberException("Incorrect Password");
            if (!authenticateFrequentFlyerMember.withActiveAccount(memberName))
                throw new AccountExpiredException("Account has expired. Please renew your account");
            return ResponseEntity.status(HttpStatus.OK).build();
    }
}
