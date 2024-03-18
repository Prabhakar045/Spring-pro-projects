package com.xwrokz.NetflixApp.service.impl;

import com.xwrokz.NetflixApp.dto.NetflixDTO;
import com.xwrokz.NetflixApp.repository.NetFlixRepository;
import com.xwrokz.NetflixApp.service.NetflixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NetflixServiceImpl implements NetflixService {

    @Autowired
    private NetFlixRepository netFlixRepository;

    public void addNewNetflixCOntent(NetflixDTO netflixDTO) {
        System.out.println("service");
            netFlixRepository.addNewNetflixCOntent(netflixDTO);
    }
}
