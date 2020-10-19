package servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * @author huzihao
 * @since 2020/10/19 22:54
 */
public class HelloServlet implements Servlet {

    public HelloServlet() {
        System.out.println("Life cycle 0: ctor");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("Life cycle 1: init");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse)
            throws ServletException, IOException {
        var request = (HttpServletRequest) servletRequest;
        switch (request.getMethod()) {
            case "GET" -> doGet();
            case "POST" -> doPost();
        }
        System.out.println("Life cycle 2: service");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("Life cycle 3: destroy");
    }

    /**
     * 处理get请求
     */
    private void doGet() {
        System.out.println("......get");
        System.out.println("......get");
        System.out.println("......get");
        System.out.println("......get");
        System.out.println("......get");
    }

    /**
     * 处理post请求
     */
    private void doPost() {
        System.out.println("...post...");
        System.out.println("...post...");
        System.out.println("...post...");
        System.out.println("...post...");
        System.out.println("...post...");
        System.out.println("...post...");
    }
}
