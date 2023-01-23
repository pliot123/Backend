package com.backend.db.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTeamLog is a Querydsl query type for TeamLog
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTeamLog extends EntityPathBase<TeamLog> {

    private static final long serialVersionUID = -232459035L;

    public static final QTeamLog teamLog = new QTeamLog("teamLog");

    public final TimePath<java.sql.Time> clearTime = createTime("clearTime", java.sql.Time.class);

    public final NumberPath<Integer> teamSequence = createNumber("teamSequence", Integer.class);

    public final NumberPath<Integer> userSequence1 = createNumber("userSequence1", Integer.class);

    public final NumberPath<Integer> userSequence2 = createNumber("userSequence2", Integer.class);

    public final NumberPath<Integer> userSequence3 = createNumber("userSequence3", Integer.class);

    public final NumberPath<Integer> userSequence4 = createNumber("userSequence4", Integer.class);

    public QTeamLog(String variable) {
        super(TeamLog.class, forVariable(variable));
    }

    public QTeamLog(Path<? extends TeamLog> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTeamLog(PathMetadata metadata) {
        super(TeamLog.class, metadata);
    }

}

