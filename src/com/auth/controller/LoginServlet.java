package com.auth.controller;

import com.auth.model.ConstValue;
import com.auth.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        User user = new User(
                request.getParameter(ConstValue.TagUsername),
                request.getParameter(ConstValue.TagPassword)
        );
        if(user.checkUser()){
            HttpSession session = request.getSession();
            session.setAttribute(ConstValue.TagUsername, user.getUsername());
            response.sendRedirect(ConstValue.DashboardRoute);
        }else {
            doProgress(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doProgress(request, response);
    }
    protected void doProgress(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("title", ConstValue.LoginTitle);
        request.setAttribute("formRoute", ConstValue.LoginRoute);
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }
}
