package dao;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DbConnection {
	
	public static void main(String[] args) {
		System.out.println(getDb());
	}
	
	public static EntityManager getDb() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("todolist");
		
		EntityManager em = emf.createEntityManager();
		
		return em;
	}
}
