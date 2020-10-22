package servlet;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

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

        var downloadFileName = "你好.jpeg";
        var headerValueStrBuilder = new StringBuilder("attachment; filename");
        var UserAgentValue = req.getHeader("User-Agent");
        if (UserAgentValue.contains("Chrome")) {
            headerValueStrBuilder.append("=")
                    .append(URLEncoder.encode(downloadFileName, StandardCharsets.UTF_8));
        } else if (UserAgentValue.contains("Safari")) {
            headerValueStrBuilder.append("*=UTF-8''")
                    .append(URLEncoder.encode(downloadFileName, StandardCharsets.UTF_8));
        } else if (UserAgentValue.contains("Firefox")) {
            headerValueStrBuilder.append("=")
                    .append("=?UTF-8?B?")
                    .append(Base64.getEncoder()
                            .encodeToString(downloadFileName.getBytes(StandardCharsets.UTF_8)))
                    .append("?=");
        } else {
            throw new ServletException("不支持此浏览器");
        }
        resp.setHeader("Content-Disposition", headerValueStrBuilder.toString());
        // IE和chrome和新版firefox
//        resp.setHeader("Content-Disposition", "attachment; filename=" +
//                URLEncoder.encode("你好.jpeg", StandardCharsets.UTF_8));
        // safari和chrome
//        resp.setHeader("Content-Disposition", "attachment; filename*=UTF-8''" +
//                URLEncoder.encode("你好.jpeg", StandardCharsets.UTF_8));
        // 旧版firefox和 chrome
//        var encodeString = Base64.getEncoder()
//                .encodeToString("你好.jpeg".getBytes(StandardCharsets.UTF_8));
//        resp.setHeader("Content-Disposition", "attachment; filename==?UTF-8?B?%s?="
//                .formatted(encodeString));
        try (var in = servletContext.getResourceAsStream(path);
             var out = resp.getOutputStream()) {
            IOUtils.copy(in, out);
        }
    }
}
