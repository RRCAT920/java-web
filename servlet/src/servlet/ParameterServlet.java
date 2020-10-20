package servlet;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author huzihao
 * @since 2020/10/20 19:04
 */
public class ParameterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(request.getParameter("userName"));
        System.out.println(request.getParameter("password"));
        System.out.println(Arrays.toString(request.getParameterValues("hobby")));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        System.out.println(req.getParameter("userName"));
        System.out.println(req.getParameter("password"));
        System.out.println(Arrays.toString(req.getParameterValues("hobby")));
    }
}
