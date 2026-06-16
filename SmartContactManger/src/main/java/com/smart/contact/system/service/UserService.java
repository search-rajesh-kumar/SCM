package com.smart.contact.system.service;

import com.smart.contact.system.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User createAndUpdateUser(User user);

    List<User> findAllUser();

    Optional<User> findUserById(int userId);

    void deleteUserById(int userId);
}
