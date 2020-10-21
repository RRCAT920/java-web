package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pojo.Student;

/**
 * @author huzihao
 * @since 2020/10/22 01:57
 */
public class SearchStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        var studentList = new ArrayList<Student>();
        for (var i = 0; i < 10; i++) {
            int t = i + 1;
            studentList.add(new Student(t, "name" + t, 18 + t, "phone" + t));
        }
        req.setAttribute("studentList", studentList);
        req.getRequestDispatcher("/practice/showStudent.jsp").forward(req, resp);
    }
}
