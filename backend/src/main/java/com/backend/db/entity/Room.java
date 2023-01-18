package com.backend.db.entity;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity//JPA에서 관리하는 객체라는 것을 알려주는 것
@Table(name = "room")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Room {
    @Id//pk라는 것을 나타냄
    @Column(name = "room_id", length = 50)
    private String roomId;

    @Column(name = "game_type")
    private Integer gameType;

    @Column(name = "is_public")
    private boolean isPublic;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Column(name = "password", length = 50)
    private String password;

    @Column(name = "status", length = 10)
    private String status;

    @Column(name = "created_at", nullable = false, updatable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp createdAt;
}
