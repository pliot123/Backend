package com.backend.db.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBoardArticle is a Querydsl query type for BoardArticle
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBoardArticle extends EntityPathBase<BoardArticle> {

    private static final long serialVersionUID = 712480946L;

    public static final QBoardArticle boardArticle = new QBoardArticle("boardArticle");

    public final NumberPath<Integer> articleSequence = createNumber("articleSequence", Integer.class);

    public final StringPath contents = createString("contents");

    public final NumberPath<Integer> div = createNumber("div", Integer.class);

    public final NumberPath<Integer> goodCount = createNumber("goodCount", Integer.class);

    public final DateTimePath<java.sql.Timestamp> modify_time = createDateTime("modify_time", java.sql.Timestamp.class);

    public final DateTimePath<java.sql.Timestamp> registerTime = createDateTime("registerTime", java.sql.Timestamp.class);

    public final StringPath title = createString("title");

    public final NumberPath<Integer> userSequence = createNumber("userSequence", Integer.class);

    public final NumberPath<Integer> views = createNumber("views", Integer.class);

    public QBoardArticle(String variable) {
        super(BoardArticle.class, forVariable(variable));
    }

    public QBoardArticle(Path<? extends BoardArticle> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBoardArticle(PathMetadata metadata) {
        super(BoardArticle.class, metadata);
    }

}

