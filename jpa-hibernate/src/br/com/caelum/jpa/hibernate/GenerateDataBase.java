package br.com.caelum.jpa.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GenerateDataBase {
	public static void main(String[] args) {
		EntityManagerFactory enf = Persistence.createEntityManagerFactory("jpa-hibernate");
		EntityManager em = enf.createEntityManager();
		
		/*em.getTransaction().begin();
		em.persist(new User("guilherme", "gui", "123"));
		em.getTransaction().commit();
		*/
		
		User user = em.find(User.class, 1L); // could also be new Long(1);
		System.out.println(user.getName());
		em.close();
		enf.close();
	}
}
