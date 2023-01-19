package com.backend.api.request;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;

@Data
public class WriteReq {

    @Column(name = "user_sequence")
    private Integer userSequence;
    private String title;
    private String contents;

}
