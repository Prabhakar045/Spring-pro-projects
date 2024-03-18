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

@WebServlet(urlPatterns = "/register")
public class StudentServlet extends HttpServlet {

    private NewYearService newYearService = new NewYearServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // Process the data from req object
        int studentId = Integer.parseInt(req.getParameter("studentId"));
        System.out.println(studentId);

        String studentName = req.getParameter("studentName");
        System.out.println(studentName);

        String email = req.getParameter("email");
        System.out.println(email);

        String college = req.getParameter("college");
        System.out.println(college);

        String branch = req.getParameter("branch");
        System.out.println(branch);

        //StudentsDTO object
        StudentsDTO studentsDTO = new StudentsDTO();
        studentsDTO.setStudentId(studentId);
        studentsDTO.setStudentName(studentName);
        studentsDTO.setEmail(email);
        studentsDTO.setCollege(college);
        studentsDTO.setBranch(branch);

        System.out.println(studentsDTO);

        newYearService.addStudentData(studentsDTO);


    }
}
