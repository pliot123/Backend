package com.backend.db.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCommentGood is a Querydsl query type for CommentGood
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCommentGood extends EntityPathBase<CommentGood> {

    private static final long serialVersionUID = 2141835770L;

    public static final QCommentGood commentGood = new QCommentGood("commentGood");

    public final NumberPath<Integer> commentSequence = createNumber("commentSequence", Integer.class);

    public final NumberPath<Integer> userSequence = createNumber("userSequence", Integer.class);

    public QCommentGood(String variable) {
        super(CommentGood.class, forVariable(variable));
    }

    public QCommentGood(Path<? extends CommentGood> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCommentGood(PathMetadata metadata) {
        super(CommentGood.class, metadata);
    }

}

