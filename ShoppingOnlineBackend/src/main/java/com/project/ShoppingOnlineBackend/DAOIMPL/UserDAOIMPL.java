package com.project.ShoppingOnlineBackend.DAOIMPL;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project.ShoppingOnlineBackend.DAO.UserDAO;
import com.project.ShoppingOnlineBackend.model.Address;
import com.project.ShoppingOnlineBackend.model.Cart;
import com.project.ShoppingOnlineBackend.model.User;

@Repository("userDAO")
@Transactional
public class UserDAOIMPL implements UserDAO {

	@Autowired
	SessionFactory sessionFactory;
	public boolean addUser(User user) {
		
		try
		{
			user.setEnabled(true);
			sessionFactory.getCurrentSession().persist(user);
			return true;
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	public User getByEmail(String email) {
		
		String selectQuery = "FROM User WHERE email = :email";
		try {
		return sessionFactory
				.getCurrentSession()
					.createQuery(selectQuery,User.class)
						.setParameter("email",email)
							.getSingleResult();
		}
		
		catch(Exception ex) 
		{
			return null;
		}
	}

	public boolean addAddress(Address address) {
		
		try
		{
			
			sessionFactory.getCurrentSession().persist(address);
			return true;
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
	}

	public boolean updateCart(Cart cart) {
		try 
		{			
			sessionFactory.getCurrentSession().update(cart);
			return true;
		}
		catch(Exception ex) 
		{		
			ex.printStackTrace();
			return false;	
		}		
	}

}
