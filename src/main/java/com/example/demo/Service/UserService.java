package com.example.demo.Service;

import com.example.demo.Model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUserById(long id);

    User saveUser(User user);

    void deleteUser(long id);
}
