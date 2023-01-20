package com.backend.api.request;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class NoticeCommentReq {
    private Integer noticeSequence;
    private String nickname;
    private String contents;
    private String goodCount;
    private Integer open;
}
