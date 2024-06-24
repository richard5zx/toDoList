package dao.impl;

import java.util.List;

import dao.DbConnection;
import dao.UserDao;
import entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

public class UserDaoImpl implements UserDao {
	
	public static void main(String[] args) {
		
		// ------- Tests -------
		// addUser Test
//		User user = new User("Bill", "Gobs", "bill123", "billpass");
//		new UserDaoImpl().addUser(user);
		
		// queryAll Test
//        List<User> userList = new UserDaoImpl().queryAll();
//        for(User user : userList) {
//        	System.out.println(user.getFirstname() + " " + user.getLastname());
//        }
		
		// queryUser Test
//		List<User> userList = new UserDaoImpl().queryUser("Bob123", "bobpass");
//		for(User user1 : userList) {
//			System.out.println(user1.getFirstname() + " " + user1.getLastname());
//		}
		
		// queryUsername Test
//		List<User> userList2 = new UserDaoImpl().queryUsername("bill123");
//        for(User user2 : userList2) {
//            System.out.println(user2.getFirstname() + " " + user2.getLastname());
//        }
		
		// queryById Test
//		User user = new UserDaoImpl().queryById(1);
//		System.out.println(user.getFirstname());
		
		// updateUser Test
//		User user = new UserDaoImpl().queryById(1);
//		user.setFirstname("Boban");
//		new UserDaoImpl().updateUser(user);
		
		// deleteUser
//		User user = new UserDaoImpl().queryById(1);
//		new UserDaoImpl().deleteUser(user);
	}
	
	private static final EntityManager em = DbConnection.getDb();
	
	@Override
	public void addUser(User user) {
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(user);
		et.commit();
	}

	@Override
	public List<User> queryAll() {
		String SQL = "SELECT * FROM users";
		Query q = em.createNativeQuery(SQL, User.class);
		
		return q.getResultList();
	}

	@Override
	public List<User> queryUser(String username, String password) {
		String SQL = "SELECT * FROM users WHERE username=?1 and password=?2";
		Query q = em.createNativeQuery(SQL, User.class);
		q.setParameter(1, username);
		q.setParameter(2, password);
		
		return q.getResultList();
	}

	@Override
	public List<User> queryUsername(String username) {
		String SQL = "SELECT * FROM users WHERE username=?1";
		Query q = em.createNativeQuery(SQL, User.class);
		q.setParameter(1, username);
		
		return q.getResultList();
	}

	@Override
	public User queryById(int userid) {
		User user = em.find(User.class, userid);
		return user;
	}

	@Override
	public void updateUser(User user) {
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.merge(user);
		et.commit();
	}

	@Override
	public void deleteUser(User user) {
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.remove(user);
		et.commit();
	}

}
