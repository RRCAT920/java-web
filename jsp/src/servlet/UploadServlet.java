package servlet;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import java.io.File;
import java.io.IOException;
import java.util.List;

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
        // 判断是否是多段上传
        if (ServletFileUpload.isMultipartContent(req)) {
            // 实例化FileItemFactory
            var fileItemFactory = new DiskFileItemFactory();
            // 实例化ServletFileUpload
            var fileUpload = new ServletFileUpload(fileItemFactory);
            // 解析上传数据，得到每个表单项FileItem
            try {
                @SuppressWarnings("unchecked") List<FileItem> fileItemList = fileUpload.parseRequest(req);
                for (var fileItem : fileItemList) {
                    if (fileItem.isFormField()) {
                        System.out.println("表单项name=" + fileItem.getFieldName());
                        System.out.println("表单项value=" + fileItem.getString("UTF-8"));
                    } else {
                        System.out.println("表单项name=" + fileItem.getFieldName());
                        System.out.println("filename=" + fileItem.getName());
                        var file = new File(fileItem.getName());
                        System.out.println(file.getAbsolutePath());
                        fileItem.write(file);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
