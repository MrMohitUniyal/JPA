package io.mohit;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class PokedeskInitiatorRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("rohan");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();
		Pokemon p = entitymanager.find(Pokemon.class,"Pikachu");
		
		System.out.println(p);
	}

}
