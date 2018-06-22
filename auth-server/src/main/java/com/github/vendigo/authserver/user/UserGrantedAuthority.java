package com.github.vendigo.authserver.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;

import lombok.Data;

@Entity
@Data
public class UserGrantedAuthority implements GrantedAuthority {

    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String authority;

    public UserGrantedAuthority(final String authority) {
        this.authority = authority;
    }
}
