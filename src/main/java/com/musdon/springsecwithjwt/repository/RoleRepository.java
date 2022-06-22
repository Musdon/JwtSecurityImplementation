package com.musdon.springsecwithjwt.repository;

import com.musdon.springsecwithjwt.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}
