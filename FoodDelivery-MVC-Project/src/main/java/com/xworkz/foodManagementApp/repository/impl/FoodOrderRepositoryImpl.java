package com.xworkz.foodManagementApp.repository.impl;

import com.xworkz.foodManagementApp.dto.FoodOrderDTO;
import com.xworkz.foodManagementApp.repository.FoodOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

@Repository
public class FoodOrderRepositoryImpl implements FoodOrderRepository {

    @Autowired
    EntityManagerFactory entityManagerFactory;


    public void saveFoodOrderDetails(FoodOrderDTO foodOrderDTO) {
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(foodOrderDTO);
        entityManager.getTransaction().commit();
    }

    public List<FoodOrderDTO> getAllFoodOrderDetails() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query= entityManager.createNamedQuery("getAllFoodOrderDetails");
        return query.getResultList();
    }

    public FoodOrderDTO getFoodOrderDetailsById(int id) {
        System.out.println("getFoodOrderDetailsById");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        return  entityManager.find(FoodOrderDTO.class,id);

    }

    public FoodOrderDTO updateFoodOrderById(int id, FoodOrderDTO dtp) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        FoodOrderDTO existingOrder = entityManager.find(FoodOrderDTO.class,id);
        if (dtp != null){

            existingOrder.setFoodName(dtp.getFoodName());
            existingOrder.setQuantity(dtp.getQuantity());
            existingOrder.setPrice(dtp.getPrice());
            existingOrder.setAddress(dtp.getAddress());
            existingOrder.setCustomerName(dtp.getCustomerName());
            existingOrder.setContactNumber(dtp.getContactNumber());

            entityManager.merge(existingOrder);
        }
        entityManager.getTransaction().commit();
        return existingOrder;
    }

    public FoodOrderDTO deleteFoodOrderById(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        FoodOrderDTO existingDTO =entityManager.find(FoodOrderDTO.class,id);

        entityManager.remove(existingDTO);

        entityManager.getTransaction().commit();

        return existingDTO;
    }
}
