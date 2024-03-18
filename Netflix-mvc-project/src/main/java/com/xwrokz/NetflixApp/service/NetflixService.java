package com.xwrokz.NetflixApp.service;

import com.xwrokz.NetflixApp.dto.NetflixDTO;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public interface NetflixService {

    public void addNewNetflixCOntent(NetflixDTO netflixDTO);
}
