package com.calisthenics.dragonhealth.api.controller;

import com.calisthenics.dragonhealth.api.request.SignUpReq;
import com.calisthenics.dragonhealth.api.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import javax.mail.MessagingException;
import java.net.UnknownHostException;

@Slf4j
@RestController
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/user")
    public ResponseEntity signup(@RequestBody SignUpReq signUpReq) throws UnknownHostException, MessagingException {
        userService.signup(signUpReq);

        return new ResponseEntity(HttpStatus.OK);
    }

}
