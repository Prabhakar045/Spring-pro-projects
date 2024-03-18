package com.xworkz.techApp.service.impl;


import com.xworkz.techApp.dto.TechnologyDTO;
import com.xworkz.techApp.repository.TechnologyRepository;
import com.xworkz.techApp.service.TechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TechnologyServiceImpl implements TechnologyService {
    @Autowired
    private TechnologyRepository technologyRepository;

    public void validateAndSave(TechnologyDTO technologyDTO) {

        technologyRepository.save(technologyDTO);
    }

    @Override
    public List<TechnologyDTO> getAllInfo() {
        return technologyRepository.getAllInfo()
                ;
    }

    @Override
    public TechnologyDTO getInfoById(int id) {
        return technologyRepository.getInfoById(id);
    }

    @Override
    public TechnologyDTO updateInfoById(int id, TechnologyDTO dto) {
        return technologyRepository.updateInfoById(id,dto);
    }

    @Override
    public TechnologyDTO deleteUserById(int id) {
        return technologyRepository.deleteUserById(id);
    }
}
