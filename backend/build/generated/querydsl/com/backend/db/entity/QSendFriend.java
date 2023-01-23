package com.backend.db.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QSendFriend is a Querydsl query type for SendFriend
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSendFriend extends EntityPathBase<SendFriend> {

    private static final long serialVersionUID = 111938120L;

    public static final QSendFriend sendFriend = new QSendFriend("sendFriend");

    public final NumberPath<Integer> getSequence = createNumber("getSequence", Integer.class);

    public final NumberPath<Integer> sendSequence = createNumber("sendSequence", Integer.class);

    public QSendFriend(String variable) {
        super(SendFriend.class, forVariable(variable));
    }

    public QSendFriend(Path<? extends SendFriend> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSendFriend(PathMetadata metadata) {
        super(SendFriend.class, metadata);
    }

}

