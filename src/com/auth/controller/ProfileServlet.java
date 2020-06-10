package com.auth.controller;

import com.auth.model.ConstValue;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "ProfileServlet", urlPatterns = {"/profile"})
public class ProfileServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.setAttribute(ConstValue.TagPhone,
                request.getParameter(ConstValue.TagPhone));
        session.setAttribute(ConstValue.TagGender,
                request.getParameter(ConstValue.TagGender));
        doProgress(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doProgress(request, response);
    }

    protected void doProgress(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("title", ConstValue.ProfileTitle);
        request.setAttribute("logoutRoute", ConstValue.LogoutRoute);
        request.getRequestDispatcher("profile.jsp").forward(request, response);
    }
}
