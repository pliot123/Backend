package com.calisthenics.dragonhealth.api.service;

import com.calisthenics.dragonhealth.api.request.SignUpReq;
import com.calisthenics.dragonhealth.db.entity.User;
import com.calisthenics.dragonhealth.db.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.net.UnknownHostException;

import java.util.Collections;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Transactional
    public User signup(final SignUpReq signUpReq) throws UnknownHostException {

//        if (userRepository.findOneWithRolesByEmail(signUpReq.getEmail()).orElse(null) != null) {
//            throw new EmailDuplicateException(signUpReq);
//        }
//
//        Role role = Role.builder()
//                .roleId(1)
//                .roleName("ROLE_USER")
//                .build();
//
//        String authKey = mailService.sendAuthMail(signUpReq.getEmail(), signUpReq.getNickname());
//        int imgNum = (int) (Math.random()*25 + 1);
//
        User user = User.builder()
                .email(signUpReq.getEmail())
                .password(signUpReq.getPassword())
                .nickname(signUpReq.getNickname())
                .gender(signUpReq.getGender())
                .telNumber(signUpReq.getTelNumber())
                .build();
        //사진이 들어올 경우
        //작업 넣어주고 userSeuqence빼주고 사진을 넣어주면
        //imgpath sequnce바탕으로 경로 짜줘야함
        return userRepository.save(user);
    }
}
