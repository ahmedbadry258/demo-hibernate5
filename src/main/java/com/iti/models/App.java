package com.iti.models;

import com.iti.services.PassengerService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class App {
  public static void main(String[] args) {

      PassengerService passengerService=new PassengerService();
      Passenger p= new Passenger();
      p.setName("Wael");
      p.setAddress("alex");
      passengerService.insert(p);
    System.out.println("Done");
  }
}
