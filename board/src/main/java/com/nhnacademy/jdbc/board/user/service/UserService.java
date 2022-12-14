package com.nhnacademy.jdbc.board.user.service;

import com.nhnacademy.jdbc.board.user.domain.User;

import java.util.Optional;

public interface UserService {
     Optional<User> getUser(String username, String password);
     Optional<User> findByUsername(String username);
}
