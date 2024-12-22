 package io.mohit;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class PokeDeskInitiatorCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pokemon p1 = new Pokemon();
		p1.setName("Pikachu");
		p1.setType("Electrical");
		p1.setPower(100);
		
		EntityManagerFactory entitymanagerfactory = Persistence.createEntityManagerFactory("rohan");
		EntityManager entitymanager = entitymanagerfactory.createEntityManager();
		EntityTransaction entitytransaction = entitymanager.getTransaction();
		
		entitytransaction.begin();
		entitymanager.persist(p1);
		entitytransaction.commit();
	}

}