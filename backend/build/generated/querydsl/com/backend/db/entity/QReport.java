package com.backend.db.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QReport is a Querydsl query type for Report
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QReport extends EntityPathBase<Report> {

    private static final long serialVersionUID = -202854346L;

    public static final QReport report = new QReport("report");

    public final StringPath contents = createString("contents");

    public final NumberPath<Integer> getSequence = createNumber("getSequence", Integer.class);

    public final NumberPath<Integer> kind = createNumber("kind", Integer.class);

    public final StringPath registerTime = createString("registerTime");

    public final NumberPath<Integer> reportSequence = createNumber("reportSequence", Integer.class);

    public final NumberPath<Integer> sendSequence = createNumber("sendSequence", Integer.class);

    public QReport(String variable) {
        super(Report.class, forVariable(variable));
    }

    public QReport(Path<? extends Report> path) {
        super(path.getType(), path.getMetadata());
    }

    public QReport(PathMetadata metadata) {
        super(Report.class, metadata);
    }

}

