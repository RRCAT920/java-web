package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author huzihao
 * @since 2020/10/22 04:57
 */
public class UploadServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try (var servletIn = req.getInputStream()) {
            var buffer = new byte[1024];
            for (var length = 0; -1 != (length = servletIn.read(buffer)); ) {
                System.out.println(new String(buffer, 0, length));
            }
        }
    }
}
