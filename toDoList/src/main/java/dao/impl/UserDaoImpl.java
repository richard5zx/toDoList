package dao.impl;

import java.util.List;

import dao.DbConnection;
import dao.UserDao;
import entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class UserDaoImpl implements UserDao {
	
	public static void main(String[] args) {
		
		// ------- Tests -------
		// addUser Test
		// User user = new User("Bob", "Myers", "bob123", "bobpass");
		// new UserDaoImpl().addUser(user);
		
		// queryAll Test
		
		// queryUser Test
		
		// queryUsername Test
		
		// queryById Test
		// User user = new UserDaoImpl().queryById(1);
		//stem.out.println(user.getFirstname());
		
		// updateUser Test
		// Why doesn't the below work
		// User user = new User("Bob", "Myers", "bob123", "bobpass");
		// user.setFirstname("Boban");
		// new UserDaoImpl().updateUser(user);
		User user = new UserDaoImpl().queryById(1);
		user.setFirstname("Boban");
		new UserDaoImpl().updateUser(user);
		
		// deleteUser
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User queryUser(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean queryUsername(String username) {
		// TODO Auto-generated method stub
		return false;
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
		// TODO Auto-generated method stub
		
	}

}
