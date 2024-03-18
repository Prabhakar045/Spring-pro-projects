package com.xworkz.NewYearApp.servlet;

import com.xworkz.NewYearApp.dto.StudentsDTO;
import com.xworkz.NewYearApp.service.NewYearService;
import com.xworkz.NewYearApp.service.impl.NewYearServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/delete")
public class StudentDeleteServlet extends HttpServlet {

    private NewYearService newYearService = new NewYearServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Assuming studentId is an integer
        String studentIdParam = req.getParameter("studentId");
        int studentId = Integer.parseInt(studentIdParam);

        StudentsDTO deletedStudent = newYearService.deleteByID(studentId);

        if (deletedStudent != null) {
            resp.sendRedirect("getAllStudents");
        }
    }
}
