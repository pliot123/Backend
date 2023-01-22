package com.backend.api.controller;

import com.backend.api.request.CommentReq;
import com.backend.api.service.CommentService;
import com.backend.db.entity.Comment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@Transactional
@RequestMapping("/board/comment")
public class CommentController {

    private final CommentService commentService;

    @Autowired
    public CommentController(CommentService commentService){
        this.commentService = commentService;
    }

    @PutMapping("/{articleSequence}/{commentSequence}")
    public ResponseEntity heartPlus(@PathVariable int articleSequence,@PathVariable int commentSequence){
//        Comment cur = commentService.getOne(articleSequence, commentSequence);
//        commentService.modify(cur);

        return new ResponseEntity("하트 추가 완료",HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity write(@RequestBody CommentReq commentReq){
        commentService.writeComment(commentReq);
        return new ResponseEntity("글쓰기 완료", HttpStatus.OK);
    }

    @DeleteMapping("/{articleSequence}")
    public ResponseEntity deleteAll(@PathVariable int articleSequence){
        int flag = commentService.deleteCommentAll(articleSequence);
        if(flag==1)
            return new ResponseEntity("삭제 완료",HttpStatus.OK);
        else
            return new ResponseEntity("삭제 실패",HttpStatus.OK);
    }

    @GetMapping("/{articleSequence}")
    public List getList(@PathVariable int articleSequence){
        List<Comment> commentList = commentService.getAllList(articleSequence);
        return commentList;
    }

}
