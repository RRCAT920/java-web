package servlet;

import org.apache.commons.io.IOUtils;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author huzihao
 * @since 2020/10/22 14:46
 */
public class DownloadServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        var filename = "timg.jpeg";
        var servletContext = getServletContext();
        var path = "/file/" + filename;
        var mimeType = servletContext.getMimeType(path);
        resp.setContentType(mimeType);
        resp.setHeader("Content-Disposition", "attachment;filename=" + filename);
        try (var in = servletContext.getResourceAsStream(path);
             var out = resp.getOutputStream()) {
            IOUtils.copy(in, out);
        }
    }
}
