package com.example.weatherApi.Service;

import com.example.weatherApi.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long userId);
    User createUser(User user);
    User updateUser(Long userId, User updatedUser);
    void deleteUser(Long userId);
}

