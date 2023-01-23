package com.backend.db.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QUser is a Querydsl query type for User
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUser extends EntityPathBase<User> {

    private static final long serialVersionUID = 634527565L;

    public static final QUser user = new QUser("user");

    public final StringPath email = createString("email");

    public final NumberPath<Float> exp = createNumber("exp", Float.class);

    public final NumberPath<Integer> gender = createNumber("gender", Integer.class);

    public final StringPath imagePath = createString("imagePath");

    public final NumberPath<Integer> level = createNumber("level", Integer.class);

    public final NumberPath<Float> mannerPoint = createNumber("mannerPoint", Float.class);

    public final TimePath<java.sql.Time> minClearTime = createTime("minClearTime", java.sql.Time.class);

    public final StringPath nickname = createString("nickname");

    public final StringPath password = createString("password");

    public final StringPath telNumber = createString("telNumber");

    public final TimePath<java.sql.Time> totalPlayTime = createTime("totalPlayTime", java.sql.Time.class);

    public final NumberPath<Integer> userSequence = createNumber("userSequence", Integer.class);

    public QUser(String variable) {
        super(User.class, forVariable(variable));
    }

    public QUser(Path<? extends User> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUser(PathMetadata metadata) {
        super(User.class, metadata);
    }

}

