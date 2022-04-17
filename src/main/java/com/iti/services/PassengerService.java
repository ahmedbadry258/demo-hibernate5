package com.iti.services;

import com.iti.models.Passenger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PassengerService {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernatefundamentals.iti");
    EntityManager em = emf.createEntityManager();
    public void insert(Passenger passenger){
        em.getTransaction().begin();
        Passenger p= passenger;
        em.persist(p);

        em.getTransaction().commit();
        emf.close();
    }

}
