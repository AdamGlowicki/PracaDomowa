package com.adamglowicki.userengine.dao;

import com.adamglowicki.userengine.domain.User;

import java.util.List;

public interface UserRepositroyDao {
    void addUser(User user);
    User getById(Integer id);
    User getByLogin(String login);
    User getName(String name);
    List<User> getuserList();
}
