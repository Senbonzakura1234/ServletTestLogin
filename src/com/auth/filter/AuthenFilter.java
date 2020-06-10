package com.auth.filter;

import com.auth.model.ConstValue;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "AuthenFilter" , urlPatterns = {"/*"})
public class AuthenFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
            throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        HttpSession session = request.getSession();
        String uri = request.getRequestURI();

        if (session.getAttribute(ConstValue.TagUsername) == null) {
            request.setAttribute("title", ConstValue.LoginTitle);
            request.setAttribute("formRoute", ConstValue.LoginRoute);
            RequestDispatcher rd = request.getRequestDispatcher(ConstValue.LoginRoute);
            rd.forward(request, response);
        }else {
            for(String path : ConstValue.redirectPath){
                if(uri.contains(path)){
                    RequestDispatcher rd = request.getRequestDispatcher(ConstValue.DashboardRoute);
                    rd.forward(request, response);
                    return;
                }
            }
            chain.doFilter(req, resp);
        }

    }

    public void init(FilterConfig config) throws ServletException {

    }

}
