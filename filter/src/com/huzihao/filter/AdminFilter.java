package com.huzihao.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * @author huzihao
 * @since 2020/10/26 20:56
 */
public class AdminFilter implements Filter {
    @Override
    public void destroy() {
    }

    /**
     * 专门用于拦截请求和过滤响应
     *
     * @param req
     * @param resp
     * @param chain
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
            throws ServletException, IOException {
        var session = ((HttpServletRequest) req).getSession();
        var user = session.getAttribute("user");
        if (null == user) {
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
            System.out.println("拦截");
        } else {
            // 让程序继续进行，访问目标资源
            chain.doFilter(req, resp);
        }
    }

    @Override
    public void init(FilterConfig config) throws ServletException {

    }

}
