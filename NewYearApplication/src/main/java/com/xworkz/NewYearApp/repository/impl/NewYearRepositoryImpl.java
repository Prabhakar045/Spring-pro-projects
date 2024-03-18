package com.xworkz.NewYearApp.repository.impl;

import com.xworkz.NewYearApp.dto.StudentsDTO;
import com.xworkz.NewYearApp.entityManagerFactory.EntityManagerFactorySingleton;
import com.xworkz.NewYearApp.repository.NewYearRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

public class NewYearRepositoryImpl implements NewYearRepository {

    @Transactional
    public void addStudentData(StudentsDTO dto) {
        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        EntityTransaction transaction =entityManager.getTransaction();

        try {
            transaction.begin();

            // Use merge instead of persist
            entityManager.merge(dto);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace(); // Log or handle the exception appropriately
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
    }



    public List<StudentsDTO> getAllStudentsData() {
        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        Query query = entityManager.createNamedQuery("getAllInfo");

        List<StudentsDTO> resultList1 = query.getResultList();

        return resultList1;
    }

    public StudentsDTO updateByID(int id, StudentsDTO dto) {
        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();


        transaction.begin();

        StudentsDTO user = entityManager.find(StudentsDTO.class, id);


        user.setStudentName(dto.getStudentName());
        user.setEmail(dto.getEmail());
        user.setCollege(dto.getCollege());
        user.setBranch(dto.getBranch());


        entityManager.merge(user);

        transaction.commit();
        return user;
    }

    public StudentsDTO deleteByID(int id) {
        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        StudentsDTO user = entityManager.find(StudentsDTO.class, id);

        if (user != null) {
            entityManager.remove(user);
        }

        transaction.commit();
        return user;
    }

    public StudentsDTO getInfoById(int id) {
        EntityManager entityManager = EntityManagerFactorySingleton.getFactory().createEntityManager();


        Query query = entityManager.createNamedQuery("getInfoById");
        query.setParameter("id", id);

        List<StudentsDTO> resultList = query.getResultList();


        return resultList.get(0);
    }
}
