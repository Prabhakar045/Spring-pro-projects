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
import java.util.List;

@WebServlet("/getAllStudents")
public class StudentGetServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private NewYearService newYearService;

    public StudentGetServlet() {
        newYearService = new NewYearServiceImpl();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<StudentsDTO> students = newYearService.getAllStudentsData();
        request.setAttribute("students", students);

        request.getRequestDispatcher("/studentList.jsp").forward(request, response);
    }
}
