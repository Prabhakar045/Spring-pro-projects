package com.xworkz.NewYearApp.service;

import com.xworkz.NewYearApp.dto.StudentsDTO;

import java.util.List;

public interface NewYearService {

    void addStudentData(StudentsDTO dto);

    public List<StudentsDTO> getAllStudentsData();

    public StudentsDTO updateByID(int id, StudentsDTO dto);

    public  StudentsDTO deleteByID(int id);

    public StudentsDTO getInfoById(int id);
}
