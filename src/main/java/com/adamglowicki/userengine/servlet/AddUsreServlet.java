package com.adamglowicki.userengine.servlet;

import com.adamglowicki.userengine.dao.UserRepositoryDaoBin;
import com.adamglowicki.userengine.dao.UserRepositroyDao;
import com.adamglowicki.userengine.domain.User;
import com.adamglowicki.userengine.repository.UserRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/add-user")
public class AddUsreServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        Integer id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        Integer age = Integer.parseInt(req.getParameter("age"));

        UserRepositroyDao dao = new UserRepositoryDaoBin();
        User user = new User(id, name, login, password, age);

        dao.addUser(user);

    }

}