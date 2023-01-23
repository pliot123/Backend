package com.backend.api.service;

import com.backend.db.repository.BoardGoodRepository;
import com.backend.db.repository.CommentGoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodService {

    private BoardGoodRepository boardGoodRepository;
    private CommentGoodRepository commentGoodRepository;

    @Autowired
    public GoodService(BoardGoodRepository boardGoodRepository,
                       CommentGoodRepository commentGoodRepository) {
        this.boardGoodRepository = boardGoodRepository;
        this.commentGoodRepository = commentGoodRepository;
    }


    public int findBoardGood(Integer userSequence, Integer articleSequence) {
        return boardGoodRepository.findByUserSequenceAndArticleSequence(userSequence,articleSequence);
    }
}
