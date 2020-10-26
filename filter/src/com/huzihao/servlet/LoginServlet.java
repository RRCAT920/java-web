package com.huzihao.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author huzihao
 * @since 2020/10/26 21:11
 */
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        var username = req.getParameter("username");
        var password = req.getParameter("password");

        if ("admin".equals(username) && "admin".equals(password)) {
            req.getSession().setAttribute("user", username);
            resp.getWriter().print("登录成功！");
        } else {
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
        }
    }
}
