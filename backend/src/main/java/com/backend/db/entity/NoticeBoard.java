package com.backend.db.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Time;
import java.sql.Timestamp;

@Data
@Builder
@Table(name ="notice_board")
public class NoticeBoard {
    @Id
    @Column(name = "notice_sequence")
    private Integer noticeSequence;

    @Column(name = "user_sequence")
    private Integer userSequence;

    private String title;

    private String contents;

    @Column(name = "register_time")
    private Timestamp registerTime;

    @Column(name = "modify_time")
    private Timestamp modify_time;

    private Integer views;

    private Integer hearts;
}
