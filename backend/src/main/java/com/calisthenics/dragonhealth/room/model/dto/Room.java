package com.calisthenics.dragonhealth.room.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.sql.Timestamp;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by jaeho lee on 2023-01-15
 */

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Room {

    private String roomId;

    private Integer gameType;

    private boolean isPublic;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    private String status;

    private Timestamp createdAt;

}