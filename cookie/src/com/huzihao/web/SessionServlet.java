package com.huzihao.web;

import com.huzihao.utils.CookieUtils;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author huzihao
 * @since 2020/10/24 19:05
 */
public class SessionServlet extends BaseServlet {
    protected void createOrGetSession(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        var session = req.getSession();
        var respWr = resp.getWriter();
        respWr.print("是否是新创建：" + session.isNew() + "<br>");
        respWr.print("ID: " + session.getId());
    }

    protected void setAttribute(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        var session = req.getSession();
        session.setAttribute("session", "session");
        resp.getWriter().print("已经向session中存入数据");
    }

    protected void getAttribute(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        var session = req.getSession();
        resp.getWriter().print("从session中获得的数据[session=%s]"
                .formatted(session.getAttribute("session")));
    }

    protected void defaultLife(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        var interval = req.getSession().getMaxInactiveInterval();
        resp.getWriter().print(interval + "s");
    }

    protected void life3Seconds(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        var session = req.getSession();
        session.setMaxInactiveInterval(3);
        resp.getWriter().print("session超时时间：" + session.getMaxInactiveInterval() + "s");
    }

    protected void invalidate(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        var session = req.getSession();
        resp.getWriter().print("session: %s 销毁".formatted(session.getId()));
        session.invalidate();
    }

    protected void dontCloseSession(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        var session = req.getSession();
        var cookie = CookieUtils.find("JSESSIONID", req.getCookies());
        // 设置cookie的生命周期
        cookie.setMaxAge(session.getMaxInactiveInterval());
        resp.addCookie(cookie);
    }
}

