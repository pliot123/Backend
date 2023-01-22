package com.backend.api.controller;

import com.backend.api.request.BoardPostReq;
import com.backend.api.request.WriteReq;
import com.backend.api.service.BoardService;
import com.backend.db.entity.BoardArticle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/board")
public class BoardController {

    private final BoardService boardService;

    @Autowired
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }


    @PostMapping
    public ResponseEntity write(@RequestBody WriteReq writeReq){
        boardService.writeNotice(writeReq);

        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/{articleSeqeunce}")
    public ResponseEntity<?> detail(@PathVariable Integer articleSeqeunce){
        BoardArticle boardArticle = boardService.getOne(articleSeqeunce);
        return new ResponseEntity<BoardArticle>(boardArticle,HttpStatus.OK);
    }

    @Transactional
    @PutMapping
    public ResponseEntity<?> modify(@RequestBody BoardPostReq boardPostReq){
        BoardArticle cur =  boardService.getOne(boardPostReq.getArticleSequence());
        boardService.modify(cur,boardPostReq);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Transactional
    @DeleteMapping("/{articleSeqeunce}")
    public ResponseEntity<?> delete(@PathVariable Integer articleSeqeunce){
        int flag = boardService.delete(articleSeqeunce);
        if(flag==1)
            return new ResponseEntity("삭제 완료",HttpStatus.OK);
        else
            return new ResponseEntity("삭제 실패",HttpStatus.OK);
    }

    @GetMapping
    public List<BoardArticle> getList(){
        List<BoardArticle> boardList = boardService.getAllList();
        return boardList;
    }
}
