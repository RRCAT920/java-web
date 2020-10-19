package servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author huzihao
 * @since 2020/10/20 00:41
 */
public class GreetingServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        // 必须要有此处来初始化父类的config属性
        super.init(config);
        System.out.println("一些初始化工作");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("GreetingServlet-doPost");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("GreetingServlet-doGet");

        var config = getServletConfig();
        System.out.println(config.getServletName());
    }
}
