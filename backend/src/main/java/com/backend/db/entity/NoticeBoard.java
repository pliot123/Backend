package com.backend.db.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;


@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="notice_board")
public class NoticeBoard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
