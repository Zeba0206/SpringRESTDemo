package com.stackroute.service;

import com.stackroute.com.stackroute.exceptions.UserAlreadyExistsException;
import com.stackroute.domain.User.User;

import java.util.List;

public interface UserService {

    public User saveUser(User user) throws UserAlreadyExistsException;

    public List<User> getAllUsers();
}
