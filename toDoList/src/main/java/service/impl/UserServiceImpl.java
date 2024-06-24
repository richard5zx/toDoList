package service.impl;

import dao.impl.UserDaoImpl;
import entity.User;
import service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public void registerUser(User user) {
		new UserDaoImpl().addUser(user);
	}

	@Override
	public boolean checkUsername(String username) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean authenticateUser(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateUser(int userid, String firstname, String lastname) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(int userid, String firstname, String lastname, String username, String password) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		
	}

}
