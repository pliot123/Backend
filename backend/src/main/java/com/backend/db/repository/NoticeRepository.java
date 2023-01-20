package com.backend.db.repository;

import com.backend.db.entity.NoticeBoard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoticeRepository extends JpaRepository<NoticeBoard, String> {

    NoticeBoard findOneByNoticeSequence(Integer noticeSequence);
    int deleteByNoticeSequence(Integer noticeSequence);
}
