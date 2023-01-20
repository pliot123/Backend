package com.backend.api.service;

import com.backend.api.request.BoardPostReq;
import com.backend.api.request.WriteReq;
import com.backend.db.entity.NoticeBoard;
import com.backend.db.repository.NoticeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class NoticeService {

    private final NoticeRepository noticeRepository;

    @Autowired
    public NoticeService(NoticeRepository noticeRepository) {
        this.noticeRepository = noticeRepository;
    }



    @Transactional
    public List<NoticeBoard> getAllList() {

        List<NoticeBoard> test = noticeRepository.findAll();
        return noticeRepository.findAll();
    }

    @Transactional
    public NoticeBoard getOne(Integer noticeSequence) {

        return noticeRepository.findOneByNoticeSequence(noticeSequence);
    }


    public Integer delete(Integer noticeSequence) {
        return noticeRepository.deleteByNoticeSequence(noticeSequence);
    }

    @Transactional
    public NoticeBoard writeNotice(WriteReq writeReq) {

        NoticeBoard noticeBoard = NoticeBoard.builder()
                .title(writeReq.getTitle())
                .userSequence(writeReq.getUserSequence())
                .contents(writeReq.getContents()).build();

        return noticeRepository.save(noticeBoard);
    }

    public void modify(NoticeBoard cur, BoardPostReq boardPostReq) {
        cur = NoticeBoard.builder()
                .noticeSequence(boardPostReq.getNoticeSequence())
                .title(boardPostReq.getTitle())
                .contents(boardPostReq.getContents()).build();
        noticeRepository.save(cur);
    }
}
