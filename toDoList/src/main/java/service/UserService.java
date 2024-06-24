package service;

import entity.User;

public interface UserService {
	// Create
	void registerUser(User user);
	
	// READ
	boolean checkIfUsernameExist(String username);
	boolean authenticateUser(String username, String password);
	
	// UPDATE
	void updateUser(int userid, String firstname, String lastname);
	void updateUser(int userid, String firstname, String lastname, String username, String password);
	
	// DELETE
	void deleteUser(User user);
}
