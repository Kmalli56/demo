package com.dao;

import com.model.User;
/**
 * 
 * @author mounika.kuna
 *
 */
public interface UserDao {
	
	public abstract User createUser(User user);

	public abstract User readUserbyId(int userId);

	public abstract User updateUser(User user);

	public abstract User deleteUserbyUserId(int userId);

	public abstract User validateUserIdAndPassword(int userId, String password);

}
