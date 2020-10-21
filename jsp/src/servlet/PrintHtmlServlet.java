package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author huzihao
 * @since 2020/10/21 20:58
 */
public class PrintHtmlServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // jsp: java服务器页面
        // jsp代替servlet回传html页面
        // jdk15才出现的文本块(Text Blocks)
        var html = """
                <!DOCTYPE html>
                <html lang="en">
                <head>
                    <meta charset="UTF-8">
                    <title>Title</title>
                </head>
                <body>
                这是html页面数据
                </body>
                </html>
                """;
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().write(html);
    }
}
