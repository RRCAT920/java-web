package com.huzihao.web;

import com.huzihao.utils.CookieUtils;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author huzihao
 * @since 2020/10/24 15:34
 */
public class CookieServlet extends BaseServlet {
    /**
     * 创建Cookie
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void createCookie(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // 创建Cookie对象
        var cookie = new Cookie("key1", "value1");
        // 通知客户端保存Cookie
        resp.addCookie(cookie);

        resp.getWriter().print("Cookie创建成功");
    }

    /**
     * 获取Cookie
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void getCookie(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        var cookies = req.getCookies();
        for (var cookie : cookies) {
            resp.getWriter().println("Cookie[%s=%s]".formatted(cookie.getName(), cookie.getValue()));
        }
    }

    /**
     * 修改Cookie
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void updateCookie(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        update2(req, resp);
    }

    private void update1(HttpServletResponse resp) {
        /*
        创建同名cookie对象
        通知客户端保存Cookie
         */
        var cookie = new Cookie("key1", "newValue1");
        resp.addCookie(cookie);
    }

    private void update2(HttpServletRequest req, HttpServletResponse resp) {
        /*
        查找要修改的Cookie对象
        调用setValue赋新值
        通知客户端保存Cookie
         */
        var cookie = CookieUtils.find("key1", req.getCookies());
        if (null != cookie) {
            cookie.setValue("newValue2");
            resp.addCookie(cookie);
        }
    }
}
