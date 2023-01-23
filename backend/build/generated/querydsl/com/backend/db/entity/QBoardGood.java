package com.backend.db.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBoardGood is a Querydsl query type for BoardGood
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBoardGood extends EntityPathBase<BoardGood> {

    private static final long serialVersionUID = -1468027263L;

    public static final QBoardGood boardGood = new QBoardGood("boardGood");

    public final NumberPath<Integer> articleSequence = createNumber("articleSequence", Integer.class);

    public final NumberPath<Integer> userSequence = createNumber("userSequence", Integer.class);

    public QBoardGood(String variable) {
        super(BoardGood.class, forVariable(variable));
    }

    public QBoardGood(Path<? extends BoardGood> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBoardGood(PathMetadata metadata) {
        super(BoardGood.class, metadata);
    }

}

