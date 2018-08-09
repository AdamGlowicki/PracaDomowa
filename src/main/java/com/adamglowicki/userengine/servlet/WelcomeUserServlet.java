package com.adamglowicki.userengine.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/welcome-servlet")
public class WelcomeUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");

        if (name == null || name.isEmpty()){
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        }
        else {
            resp.setContentType("text/html;charset=UTF-8");
            PrintWriter writer = resp.getWriter();
            writer.println("<!DOCTYPE html><body>...</body></html>");
            writer.println("Hello:" + name);
        }
    }
}
