package com.niit.ServiceDAO;

import java.util.List;

import com.niit.model.User;

public interface UserServiceDAO {
	
	public boolean addUser(User user);
	public boolean updateUser(User user);
	public boolean deleteUser(User user);
	public List<User> displayUsers();
	public User displayById(int userid);

}
