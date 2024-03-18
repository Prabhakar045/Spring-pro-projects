package com.xworkz.techApp.repository;


import com.xworkz.techApp.dto.TechnologyDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TechnologyRepository {
//extends JpaRepository<TechnologyDTO, Integer>
    void save(TechnologyDTO technologyDTO);

    public  List<TechnologyDTO>   getAllInfo();

    public TechnologyDTO getInfoById(int id);


    public TechnologyDTO updateInfoById(int id, TechnologyDTO dto );


    public TechnologyDTO deleteUserById(int id);
}
