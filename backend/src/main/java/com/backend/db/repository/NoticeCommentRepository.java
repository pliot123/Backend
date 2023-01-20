package com.backend.db.repository;

import com.backend.db.entity.NoticeComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoticeCommentRepository extends JpaRepository<NoticeComment, String> {
    List<NoticeComment> findByNoticeSequence(int noticeSequence);

    int deleteByNoticeSequence(int noticeSequence);

    NoticeComment findByNoticeSequnceAndCommentSeqeunce(int noticeSequence, int commentSequence);
}
