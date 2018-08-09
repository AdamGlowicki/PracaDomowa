package com.adamglowicki.userengine;

import com.adamglowicki.userengine.dao.UserRepositoryDaoBin;
import com.adamglowicki.userengine.dao.UserRepositroyDao;

public class Main {

    public static void main(String[] args) {
        UserRepositroyDao dao = new UserRepositoryDaoBin();

        String name = dao.getById(3).getName();
        System.out.println(name);
    }
}
