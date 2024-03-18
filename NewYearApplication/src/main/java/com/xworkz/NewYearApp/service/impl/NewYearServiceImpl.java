package com.xworkz.NewYearApp.service.impl;

import com.xworkz.NewYearApp.dto.StudentsDTO;
import com.xworkz.NewYearApp.repository.NewYearRepository;
import com.xworkz.NewYearApp.repository.impl.NewYearRepositoryImpl;
import com.xworkz.NewYearApp.service.NewYearService;

import java.util.List;

public class NewYearServiceImpl implements NewYearService {

    NewYearRepository newYearRepository = new NewYearRepositoryImpl();



    public void addStudentData(StudentsDTO dto) {

        newYearRepository.addStudentData(dto);
    }

    public List<StudentsDTO> getAllStudentsData() {

        return newYearRepository.getAllStudentsData();
    }

    public StudentsDTO updateByID(int id, StudentsDTO dto) {

        return newYearRepository.updateByID(id, dto);
    }

    public StudentsDTO deleteByID(int id) {

        return newYearRepository.deleteByID(id);
    }

    public StudentsDTO getInfoById(int id) {
        return newYearRepository.getInfoById(id);
    }
}
