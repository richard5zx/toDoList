package dao;

import java.util.List;

import entity.User;

public interface UserDao {
	// CREATE
	void addUser(User user);
	
	// READ
	List<User> queryAll();
	List<User> queryUser(String username, String password);
	List<User> queryUsername(String username);
	User queryById(int userid);
	
	// UPDATE
	void updateUser(User user);
	
	// DELETE
	void deleteUser(User user);
}
