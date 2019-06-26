package com.budmon.service;

import com.budmon.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}