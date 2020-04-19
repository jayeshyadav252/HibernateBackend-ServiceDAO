package com.niit.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.DAO.UserDAO;
import com.niit.ServiceDAO.UserServiceDAO;
import com.niit.model.User;

@Service
public class UserServiceImpl implements UserServiceDAO 
{
	@Autowired
	UserDAO userDAO;

	public boolean addUser(User user) {
		userDAO.addUser(user);
		return true;
	}

	public boolean updateUser(User user) {
		userDAO.updateUser(user);
		return true;
		
	}

	public boolean deleteUser(User user) {
		userDAO.deleteUser(user);
		return true;
	}	

	public List<User> displayUsers() {
	return	userDAO.displayUsers();
	}

	public User displayById(int userid) {
		return userDAO.displayById(userid);
	}
	

}
