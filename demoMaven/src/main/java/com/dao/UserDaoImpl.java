package com.dao;

import com.model.User;
/**
 * 
 * @author mounika.kuna
 *
 */
public class UserDaoImpl implements UserDao{

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User readUserbyId(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User deleteUserbyUserId(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User validateUserIdAndPassword(int userId, String password) {
		
		User user = null;
		if(userId == 123456 && password.equals("Employee1")) {
			user = new User(userId, "Mounika", password );
		}else if(userId == 223456 && password.equals("Employee2"))  {
			user = new User(userId, "Rekha", password);
		}
		return user;
	}

}

