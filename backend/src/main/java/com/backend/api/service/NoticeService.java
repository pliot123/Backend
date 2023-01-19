package com.backend.api.service;

import com.backend.api.request.WriteReq;
import com.backend.db.entity.NoticeBoard;
import com.backend.db.repository.NoticeRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

        return noticeRepository.findAll();
    }

    @Transactional
    public NoticeBoard writeNotice(WriteReq writeReq) {

        NoticeBoard noticeBoard = NoticeBoard.builder()
                .title(writeReq.getTitle())
                .noticeSequence(writeReq.getUserSequence())
                .contents(writeReq.getContents()).build();

        return noticeRepository.save(noticeBoard);
    }
}
