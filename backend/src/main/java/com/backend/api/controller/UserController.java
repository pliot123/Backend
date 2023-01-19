package com.backend.api.controller;

import com.backend.api.request.SignUpReq;
import com.backend.api.service.UserService;
import com.backend.db.entity.User;
import com.backend.db.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;
import java.net.UnknownHostException;

@Slf4j
@RestController
@RequestMapping("/api")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/signup")
    public ResponseEntity signup(@RequestBody SignUpReq signUpReq) throws UnknownHostException, MessagingException {
        userService.signup(signUpReq);

        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody SignUpReq signUpReq) throws UnknownHostException, MessagingException {
        System.out.println("------------------------------------------------------잘하자");

        User user = null;
        user = userService.findUserByEmail(signUpReq.getEmail());

        if(user.getPassword().equals(signUpReq.getPassword())){
            return new ResponseEntity(HttpStatus.OK);
        }
        else{
            System.out.println("실패");
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/check_email")
    public ResponseEntity<?> check_email(@RequestParam(required = true) String email){
        boolean flag= userService.checkDuplicateEmail(email);
        if(flag){
            return new ResponseEntity(HttpStatus.OK);
        }else{
            return new ResponseEntity(HttpStatus.ACCEPTED);
        }
    }

    @GetMapping("/check_nickname")
    public ResponseEntity<?> check_nickname(@RequestParam(required = true) String nickname){
        boolean flag= userService.checkDuplicateNickname(nickname);
        if(flag){
            return new ResponseEntity(HttpStatus.OK);
        }else{
            System.out.println("실패");
            return new ResponseEntity(HttpStatus.ACCEPTED);
        }
    }




}
