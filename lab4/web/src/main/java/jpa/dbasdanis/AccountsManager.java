package jpa.dbasdanis;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AccountsManager {
	
	static EntityManagerFactory factory;
	static EntityManager entityManager;

	public static void main(String[] args) {}
	
	public static void begin() {
		factory = Persistence.createEntityManagerFactory("AccountUnit");
		entityManager = factory.createEntityManager();
		entityManager.getTransaction().begin();
	}
	
	public static void create(String username,String password) {
		Accounts newAccount = new Accounts();
		newAccount.setName(username);
		newAccount.setPassword(password);
		entityManager.persist(newAccount);
	}
	
	public static Accounts read(String username) {
		
		return(entityManager.find(Accounts.class, username));
	}
	
	public static void end() {
		entityManager.getTransaction().commit();
		entityManager.close();
		factory.close();
	}
}
