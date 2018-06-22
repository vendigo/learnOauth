package com.github.vendigo.authserver.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserGrantedAuthorityRepository extends JpaRepository<UserGrantedAuthority, Long> {

}
