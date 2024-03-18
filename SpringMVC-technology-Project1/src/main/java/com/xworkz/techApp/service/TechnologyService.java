package com.xworkz.techApp.service;


import com.xworkz.techApp.dto.TechnologyDTO;

import java.util.List;

public interface TechnologyService {
    void validateAndSave(TechnologyDTO technologyDTO);

    public List<TechnologyDTO> getAllInfo();

    public TechnologyDTO getInfoById(int id);


    public TechnologyDTO updateInfoById(int id, TechnologyDTO dto );


    public TechnologyDTO deleteUserById(int id);
}
