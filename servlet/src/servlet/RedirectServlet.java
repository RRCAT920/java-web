package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author huzihao
 * @since 2020/10/20 20:57
 */
public class RedirectServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setStatus(302);
//        response.setHeader("Location", "http://localhost:8080/servlet/jump/deep/to.html");
        // 浏览器解析/为http://ip:port/
        response.sendRedirect("/servlet/jump/deep/to.html");
    }
}
