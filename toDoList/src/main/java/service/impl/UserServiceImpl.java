package service.impl;

import java.util.List;

import dao.impl.UserDaoImpl;
import entity.User;
import service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public void registerUser(User user) {
		if(authenticateUser(user.getUsernamne(), user.getPassword())) {
			new UserDaoImpl().addUser(user);
		}
	}

	@Override
	public boolean checkIfUsernameExist(String username) {
		List<User> list = new UserDaoImpl().queryUsername(username);
		
		if (list.size() > 0) {
			return true;
		} else {
			return false;
		}
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
