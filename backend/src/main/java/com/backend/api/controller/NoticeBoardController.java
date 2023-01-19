package com.backend.api.controller;

import com.backend.api.request.WriteReq;
import com.backend.api.service.NoticeService;
import com.backend.db.entity.NoticeBoard;
import io.swagger.models.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/board")
public class NoticeBoardController {

    private final NoticeService noticeService;

    @Autowired
    public NoticeBoardController(NoticeService noticeService) {
        this.noticeService = noticeService;
    }


    @PostMapping("/notice")
    public ResponseEntity write(@RequestBody WriteReq writeReq){
        noticeService.writeNotice(writeReq);

        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/notice")
    public List<NoticeBoard> getList(){
        List<NoticeBoard> boardList = noticeService.getAllList();
        return boardList;
    }
}
