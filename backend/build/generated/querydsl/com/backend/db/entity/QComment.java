package com.backend.db.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QComment is a Querydsl query type for Comment
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QComment extends EntityPathBase<Comment> {

    private static final long serialVersionUID = -2137721955L;

    public static final QComment comment = new QComment("comment");

    public final NumberPath<Integer> articleSequence = createNumber("articleSequence", Integer.class);

    public final NumberPath<Integer> commentSequence = createNumber("commentSequence", Integer.class);

    public final StringPath contents = createString("contents");

    public final NumberPath<Integer> goodCount = createNumber("goodCount", Integer.class);

    public final StringPath nickname = createString("nickname");

    public final NumberPath<Integer> open = createNumber("open", Integer.class);

    public final StringPath registerTime = createString("registerTime");

    public final StringPath title = createString("title");

    public QComment(String variable) {
        super(Comment.class, forVariable(variable));
    }

    public QComment(Path<? extends Comment> path) {
        super(path.getType(), path.getMetadata());
    }

    public QComment(PathMetadata metadata) {
        super(Comment.class, metadata);
    }

}

