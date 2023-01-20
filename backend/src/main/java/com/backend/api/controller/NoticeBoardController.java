package com.backend.api.controller;

import com.backend.api.request.BoardPostReq;
import com.backend.api.request.WriteReq;
import com.backend.api.service.NoticeService;
import com.backend.db.entity.NoticeBoard;
import io.swagger.models.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/notice")
public class NoticeBoardController {

    private final NoticeService noticeService;

    @Autowired
    public NoticeBoardController(NoticeService noticeService) {
        this.noticeService = noticeService;
    }


    @PostMapping
    public ResponseEntity write(@RequestBody WriteReq writeReq){
        noticeService.writeNotice(writeReq);

        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/{noticeSequence}")
    public ResponseEntity<?> detail(@PathVariable Integer noticeSequence){
        NoticeBoard noticeBoard = noticeService.getOne(noticeSequence);
        return new ResponseEntity<NoticeBoard>(noticeBoard,HttpStatus.OK);
    }

    @Transactional
    @PutMapping
    public ResponseEntity<?> modify(@RequestBody BoardPostReq boardPostReq){
        NoticeBoard cur =  noticeService.getOne(boardPostReq.getNoticeSequence());
        noticeService.modify(cur,boardPostReq);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Transactional
    @DeleteMapping("/{noticeSequence}")
    public ResponseEntity<?> delete(@PathVariable Integer noticeSequence){
        int flag = noticeService.delete(noticeSequence);
        if(flag==1)
            return new ResponseEntity("삭제 완료",HttpStatus.OK);
        else
            return new ResponseEntity("삭제 실패",HttpStatus.OK);
    }

    @GetMapping
    public List<NoticeBoard> getList(){
        List<NoticeBoard> boardList = noticeService.getAllList();
        return boardList;
    }
}
