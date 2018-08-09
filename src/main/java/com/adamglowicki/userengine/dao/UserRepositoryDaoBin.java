package com.adamglowicki.userengine.dao;

import com.adamglowicki.userengine.domain.User;
import com.adamglowicki.userengine.repository.UserRepository;

import java.util.List;

public class UserRepositoryDaoBin implements UserRepositroyDao {
    public void addUser(User user) {

    }

    public User getById(Integer id) {
        for (User user : UserRepository.getRepository()) {
            if (user.getId().equals(id)){
                return user;
            }
        }
        return null;
    }

    public User getByLogin(String login) {
        for (User user : UserRepository.getRepository()) {
            if (user.getLogin().equals(login)){
                return user;
            }
        }
        return null;
    }

    @Override
    public User getName(String name) {
        for (User user: UserRepository.getRepository()) {
            if (user.getName().equals(name)){
                return user;
            }
        }
        return null;
    }

    public List<User> getuserList() {
        return null;
    }
}
