package com.backend.api.service;

import com.backend.api.request.NoticeCommentReq;
import com.backend.db.entity.NoticeComment;
import com.backend.db.repository.NoticeCommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.PrePersist;
import java.time.LocalDateTime;
import java.util.List;

import static java.time.LocalTime.now;

@Service
public class NoticeCommentService {

    private final NoticeCommentRepository noticeCommentRepository;

    @Autowired
    public NoticeCommentService(NoticeCommentRepository noticeCommentRepository){
        this.noticeCommentRepository = noticeCommentRepository;
    }

    public List<NoticeComment> getAllList(int noticeSequence) {
        return noticeCommentRepository.findByNoticeSequence(noticeSequence);
    }

    @PrePersist // 데이터 생성이 이루어질때 사전 작업
    public void writeComment(NoticeCommentReq noticeCommentReq) {
        NoticeComment noticeComment = NoticeComment.builder()
                .nickname(noticeCommentReq.getNickname())
                .noticeSequence(noticeCommentReq.getNoticeSequence())
                .contents(noticeCommentReq.getContents())
                .goodCount(0)
                .open(0)
                .registerTime(String.valueOf(LocalDateTime.now())).build();
        noticeCommentRepository.save(noticeComment);
    }

    public int deleteCommentAll(int noticeSequence) {
        return noticeCommentRepository.deleteByNoticeSequence(noticeSequence);
    }

    public NoticeComment getOne(int noticeSequence, int commentSequence) {
        return noticeCommentRepository.findByNoticeSequnceAndCommentSeqeunce(noticeSequence,commentSequence);
    }

    public void modify(NoticeComment cur) {
        cur = NoticeComment.builder().goodCount(cur.getGoodCount()+1).build();
        noticeCommentRepository.save(cur);
    }
}
