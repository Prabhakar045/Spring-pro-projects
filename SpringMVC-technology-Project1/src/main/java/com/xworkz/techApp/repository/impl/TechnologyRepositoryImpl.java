package com.xworkz.techApp.repository.impl;

import com.xworkz.techApp.dto.TechnologyDTO;
import com.xworkz.techApp.repository.TechnologyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

@Repository
public class TechnologyRepositoryImpl implements TechnologyRepository {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @Override
    public void save(TechnologyDTO technologyDTO) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

            entityManager.persist(technologyDTO);
            entityManager.getTransaction().commit();

            entityManager.close();

    }

    @Override
    public List<TechnologyDTO> getAllInfo() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();

            Query query = entityManager.createNamedQuery("getAllInfo");
            return query.getResultList();

    }

    @Override
    public TechnologyDTO getInfoById(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();

            return entityManager.find(TechnologyDTO.class, id);

    }

    @Override
    public TechnologyDTO updateInfoById(int id, TechnologyDTO dto) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

            TechnologyDTO existingDTO = entityManager.find(TechnologyDTO.class, id);
            if (existingDTO != null) {

                existingDTO.setTechnologyName(dto.getTechnologyName());
                existingDTO.setVersion(dto.getVersion());
                existingDTO.setOwnedBy(dto.getOwnedBy());
                existingDTO.setYearOfRelease(dto.getYearOfRelease());

                entityManager.merge(existingDTO);
            }
            entityManager.getTransaction().commit();
            return existingDTO;

    }

    @Override
    public TechnologyDTO deleteUserById(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

            TechnologyDTO existingDTO = entityManager.find(TechnologyDTO.class, id);
            if (existingDTO != null) {
                entityManager.remove(existingDTO);
            }
            entityManager.getTransaction().commit();

        return existingDTO;
    }
}
