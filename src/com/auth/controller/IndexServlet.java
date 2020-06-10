package com.auth.controller;

import com.auth.model.ConstValue;
import sun.security.ssl.Debug;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "IndexServlet", urlPatterns = {"/index"})
public class IndexServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doProgress(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doProgress(request, response);
    }
    protected void doProgress(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Call Index Servlet");
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
