package com.xworkz.NewYearApp.servlet;

import com.xworkz.NewYearApp.dto.StudentsDTO;
import com.xworkz.NewYearApp.service.NewYearService;
import com.xworkz.NewYearApp.service.impl.NewYearServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/updateStudent")
public class StudentGetUpdateServlet extends HttpServlet {

    private NewYearService newYearService = new NewYearServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String studentIdParam = req.getParameter("studentId");
        int studentId = Integer.parseInt(studentIdParam);

        StudentsDTO studentDTO = newYearService.getInfoById(studentId);

        req.setAttribute("student", studentDTO);
        RequestDispatcher dispatcher = req.getRequestDispatcher("updateStudent.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String studentIdParam = req.getParameter("studentId");

        int studentId = Integer.parseInt(studentIdParam);

        String studentName = req.getParameter("studentName");
        String email = req.getParameter("email");
        String college = req.getParameter("college");
        String branch = req.getParameter("branch");

        StudentsDTO updatedStudent = new StudentsDTO();
        updatedStudent.setStudentId(studentId);
        updatedStudent.setStudentName(studentName);
        updatedStudent.setEmail(email);
        updatedStudent.setCollege(college);
        updatedStudent.setBranch(branch);

        StudentsDTO dto = newYearService.updateByID(studentId, updatedStudent);

        req.setAttribute("student", dto);
        RequestDispatcher dispatcher = req.getRequestDispatcher("updateStudent.jsp");
        dispatcher.forward(req, resp);

        if (dto != null) {
            resp.sendRedirect("getAllStudents");
        }
    }
}
