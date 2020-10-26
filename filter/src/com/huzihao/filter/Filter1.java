package com.huzihao.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @author huzihao
 * @since 2020/10/26 21:46
 */
public class Filter1 implements Filter {
    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
            throws ServletException, IOException {
        System.out.println("1: 前置代码");
        System.out.println("1: " + Thread.currentThread().getName());
        System.out.println("1: " + req.getParameter("username"));
        req.setAttribute("key1", "value1");
        chain.doFilter(req, resp);
        System.out.println("1: " + Thread.currentThread().getName());
        System.out.println("1: 后置代码");
    }

    @Override
    public void init(FilterConfig config) throws ServletException {

    }

}
