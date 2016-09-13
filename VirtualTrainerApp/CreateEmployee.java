package com.yash.jpademo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CreateEmployee {
	public static void main(String[] args) {

		EntityManagerFactory emfactory = Persistence
				.createEntityManagerFactory("SimpleJPADemo");

		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();

		Employee employee = new Employee();
		employee.setId(2);
		employee.setEname("Sunil");
		employee.setSalary(45000);
		employee.setDesignation("Trainee Engineer");

		entitymanager.persist(employee);
		entitymanager.getTransaction().commit();

		entitymanager.close();
		emfactory.close();
	}
}
