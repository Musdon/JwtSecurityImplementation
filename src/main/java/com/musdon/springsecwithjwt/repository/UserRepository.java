package com.musdon.springsecwithjwt.repository;

import com.musdon.springsecwithjwt.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
