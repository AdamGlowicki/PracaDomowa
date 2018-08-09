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

@WebServlet("/find-user-by-id")
public class FindUserByIdServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UserRepositroyDao dao = new UserRepositoryDaoBin();

        String idOfAdress = req.getParameter("id");



        if (idOfAdress == null || idOfAdress.isEmpty()){
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        }
        else {
            Integer id = Integer.parseInt(idOfAdress);
            String name = dao.getById(id).getName();
            resp.setContentType("text/html;charset=UTF-8");
            PrintWriter writer = resp.getWriter();
            writer.println("<!DOCTYPE html><body>...</body></html>");
            writer.println("Name: " + name);
        }
    }
}
