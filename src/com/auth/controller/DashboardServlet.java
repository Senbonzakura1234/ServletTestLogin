package com.auth.controller;

import com.auth.model.ConstValue;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "DashboardServlet", urlPatterns = {"/dashboard", "/"})
public class DashboardServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doProgress(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doProgress(request, response);
    }
    protected void doProgress(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("title", ConstValue.DashboardTitle);
        request.setAttribute("formRoute", ConstValue.ProfileRoute);
        request.setAttribute("logoutRoute", ConstValue.LogoutRoute);

        HttpSession session = request.getSession();
        String gender = "";
        if(session.getAttribute(ConstValue.TagGender) != null){
            gender = session.getAttribute(ConstValue.TagGender).toString();
        }


        if(gender != null && !gender.isEmpty()){
            if (gender.equals(ConstValue.GenderEnum.MALE.toString())) {
                request.setAttribute(ConstValue.GenderEnum.MALE.toString(),
                        ConstValue.GenderChecked);
            } else if (gender.equals(ConstValue.GenderEnum.FEMALE.toString())) {
                request.setAttribute(ConstValue.GenderEnum.FEMALE.toString()
                        , ConstValue.GenderChecked);
            } else {
                request.setAttribute(ConstValue.GenderEnum.UNKNOWN.toString()
                        , ConstValue.GenderChecked);
            }
        }else {
            request.setAttribute(ConstValue.GenderEnum.UNKNOWN.toString()
                    , ConstValue.GenderChecked);
        }

        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
