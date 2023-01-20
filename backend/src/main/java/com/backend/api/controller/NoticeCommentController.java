package com.backend.api.controller;

import com.backend.api.request.NoticeCommentReq;
import com.backend.api.service.NoticeCommentService;
import com.backend.db.entity.NoticeComment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/notice/comment")
public class NoticeCommentController {

    private final NoticeCommentService noticeCommentService;

    @Autowired
    public NoticeCommentController(NoticeCommentService noticeCommentService){
        this.noticeCommentService = noticeCommentService;
    }

    @PutMapping("/{noticeSequence}/{commentSequence}")
    public ResponseEntity heartPlus(@PathVariable int noticeSequence,@PathVariable int commentSequence){
        NoticeComment cur = noticeCommentService.getOne(noticeSequence, commentSequence);
        noticeCommentService.modify(cur);

        return new ResponseEntity("하트 추가 완료")
    }

    @PostMapping
    public ResponseEntity write(@RequestBody NoticeCommentReq noticeCommentReq){
        noticeCommentService.writeComment(noticeCommentReq);
        return new ResponseEntity("글쓰기 완료", HttpStatus.OK);
    }

    @DeleteMapping("/{noticeSequence}")
    public ResponseEntity deleteAll(@PathVariable int noticeSequence){
        int flag = noticeCommentService.deleteCommentAll(noticeSequence);
        if(flag==1)
            return new ResponseEntity("삭제 완료",HttpStatus.OK);
        else
            return new ResponseEntity("삭제 실패",HttpStatus.OK);
    }

    @GetMapping("/{noticeSequence}")
    public List getList(@PathVariable int noticeSequence){
        List<NoticeComment> commentList = noticeCommentService.getAllList(noticeSequence);
        return commentList;
    }

}
