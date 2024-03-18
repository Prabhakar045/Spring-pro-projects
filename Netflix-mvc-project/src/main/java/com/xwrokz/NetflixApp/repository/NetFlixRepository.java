package com.xwrokz.NetflixApp.repository;

import com.xwrokz.NetflixApp.dto.NetflixDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface NetFlixRepository {

       void addNewNetflixCOntent(NetflixDTO netflixDTO);
}
