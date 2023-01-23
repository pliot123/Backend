package com.backend.api.controller;

import com.backend.api.request.BoardPostReq;
import com.backend.api.request.WriteReq;
import com.backend.api.service.BoardService;
import com.backend.api.service.GoodService;
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
    private final GoodService goodService;

    @Autowired
    public BoardController(BoardService boardService,GoodService goodService) {
        this.boardService = boardService;
        this.goodService =goodService;
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

    @GetMapping("/{userSequence}")
    public List<BoardArticle> getList(@PathVariable Integer userSequence){
        List<BoardArticle> boardList = boardService.getAllList(userSequence);
        return boardList;
    }

    @GetMapping("/good/{userSequence}/{articleSequence}")
    public ResponseEntity<?> boardGood(@PathVariable Integer userSequence,@PathVariable Integer articleSequence){
        int flag = goodService.findBoardGood(userSequence,articleSequence);
        System.out.println(flag);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
