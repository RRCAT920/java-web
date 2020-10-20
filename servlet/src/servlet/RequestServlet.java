package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author huzihao
 * @since 2020/10/20 16:59
 */
public class RequestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 请求行
        System.out.printf("%s %s %s%n", request.getMethod(), request.getRequestURI(), request.getProtocol());
        // 请求头(部分)
        System.out.println("Accept: " + request.getHeader("Accept"));
        System.out.println("Accept-Encoding: " + request.getHeader("Accept-Encoding"));
        System.out.println("Accept-Language: " + request.getHeader("Accept-Language"));
        System.out.println("Host: " + request.getHeader("Host"));
        System.out.println("Connection: " + request.getHeader("Connection"));
    }
}
