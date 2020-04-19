package com.niit.DAOImpl;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.DAO.UserDAO;
import com.niit.model.User;


@Repository(value="userDAO")
@Transactional
public class UserDAOImpl implements UserDAO{
	
	@Autowired
	SessionFactory sessionFactory;
	Session session;
	public boolean addUser(User user) {
		sessionFactory.getCurrentSession().save(user);
		return true;
	}

	public boolean updateUser(User user) {
		
		sessionFactory.getCurrentSession().update(user);
		return true;
	}

	public boolean deleteUser(User user) {
		sessionFactory.getCurrentSession().delete(user);
		return true;
	}

	public List<User> displayUsers() {
			return sessionFactory.getCurrentSession().createQuery("from com.niit.model.User").list();
	}

	public User displayById(int userid) {
		
		
		Query query=	session.createQuery("from com.niit.model.User where userid=:userid");
		return (User) query.setParameter("userid", userid).getResultList().get(0);
}
	

}
