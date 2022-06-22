package com.musdon.springsecwithjwt.service;

import com.musdon.springsecwithjwt.domain.Role;
import com.musdon.springsecwithjwt.domain.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
