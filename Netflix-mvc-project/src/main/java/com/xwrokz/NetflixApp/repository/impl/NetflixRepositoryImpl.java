package com.xwrokz.NetflixApp.repository.impl;

import com.xwrokz.NetflixApp.dto.NetflixDTO;
import com.xwrokz.NetflixApp.repository.NetFlixRepository;
import com.xwrokz.NetflixApp.service.NetflixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@Repository
public class NetflixRepositoryImpl implements NetFlixRepository {
    @Autowired
    private EntityManagerFactory entityManagerFactory;

    public void addNewNetflixCOntent(NetflixDTO netflixDTO) {

        System.out.println("repo");
        EntityManager  entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(netflixDTO);
        entityManager.getTransaction().commit();

    }
}
