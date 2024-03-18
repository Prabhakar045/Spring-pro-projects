package com.xworkz.NewYearApp.dto;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "student_registration")

@NamedQueries({

        @NamedQuery(name = "getAllInfo" , query = "from StudentsDTO dto "),
        @NamedQuery(name = "getInfoById", query = "select dto FROM StudentsDTO dto WHERE dto.id = :id")
})
public class StudentsDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;
    private String studentName;
    private String email;
    private String college;
    private String branch;

}
