package com.xworkz.techApp.dto;

import com.google.protobuf.Message;
import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Data
@Entity
@NoArgsConstructor
@Table(name = "technology_table")
@NamedQueries({

        @NamedQuery(name = "getAllInfo" , query = "from TechnologyDTO dto "),
        @NamedQuery(name = "getInfoById", query = "select dto FROM TechnologyDTO dto WHERE dto.id = :id")
})
public class TechnologyDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull()
    @Size(min = 3, max = 9, message = "technology name should be between 3 and 9 characters")
    private String technologyName;

    @NotNull()
    private String ownedBy;
    @NotNull
    private double version;
    @NotNull
    private int yearOfRelease;



}
