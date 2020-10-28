package com.huzihao.servlet;

import com.google.gson.Gson;
import com.huzihao.pojo.Person;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author huzihao
 * @since 2020/10/28 12:46
 */
public class AjaxServlet extends BaseServlet {
    protected void jsAjax(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        var person = new Person(1, "李容蓉");
        var gson = new Gson();
        var personJsonStr = gson.toJson(person);
        resp.getWriter().write(personJsonStr);
    }
}
