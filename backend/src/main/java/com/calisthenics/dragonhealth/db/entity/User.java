package com.calisthenics.dragonhealth.db.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.awt.*;
import java.sql.Blob;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Seo Youngeun on 2021-07-26
 */
@Entity
@Table(name = "user")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User implements UserDetails {

    @Id
    @Column(name = "user_sequence")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userSequence;
    private String email;
    private String password;
    private String nickname;
    private Integer gender;
    @Column(name = "tel_no")
    private String telNumber;
    private Integer level;
    private Float exp;
    @Column(name = "manner_point")
    private Float mannerPoint;
    @Column(name = "min_clear_time")
    private Time minClearTime;
    @Column(name = "total_play_time")
    private Time totalPlayTime;
    @Column(name = "image_path")
    private String imagePath;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getUsername() {
        return this.email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}