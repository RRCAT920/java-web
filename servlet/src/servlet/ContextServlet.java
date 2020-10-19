package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author huzihao
 * @since 2020/10/20 01:53
 */
public class ContextServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        var ctx = getServletContext();
        System.out.println("ContextServlet's ServletContext: " + ctx);
        System.out.println(ctx.getInitParameter("context"));
        System.out.println(ctx.getContextPath());
        // /代表部署后的工程路径 映射到 部署后的web目录
        System.out.println(ctx.getRealPath("/"));
        System.out.println(ctx.getRealPath("/script"));

        System.out.println("ContextServlet Before: " + ctx.getAttribute("key1"));
        ctx.setAttribute("key1", "value1");
        System.out.println("ContextServlet After: " + ctx.getAttribute("key1"));
    }
}
