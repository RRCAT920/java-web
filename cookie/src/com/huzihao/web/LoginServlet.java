package com.huzihao.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author huzihao
 * @since 2020/10/24 17:00
 */
public class LoginServlet extends BaseServlet {
    protected void login(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        var username = req.getParameter("username");
        var password = req.getParameter("password");

        if ("abc".equals(username) && "123".equals(password)) {
            var cookie = new Cookie("username", username);
            cookie.setMaxAge(60 * 60 * 24 * 7); // aka a week
            resp.addCookie(cookie);

            System.out.println("登录成功");
        } else System.out.println("登录失败");
    }
}
