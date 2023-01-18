package com.backend.api.request;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Data
public class SignUpReq {

    @Email(message = "이메일 형식이 아닙니다.")
    @Size(min = 3, max = 50)
    private String email;
    private String password;
    private String nickname;
    private Integer gender;// 여자0 남자1
    private String telNumber;

}
