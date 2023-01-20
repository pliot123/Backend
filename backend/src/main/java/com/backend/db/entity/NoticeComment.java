package com.backend.db.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalTime;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="notice_comment")
public class NoticeComment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_sequence")
    private Integer commentSequence;
    @Column(name = "notice_sequence")
    private Integer noticeSequence;
    private String title;
    private String nickname;
    private String contents;
    @Column(name = "good_count")
    private Integer goodCount;
    @Column(name = "open_close")
    private Integer open;
    private String registerTime;

}
