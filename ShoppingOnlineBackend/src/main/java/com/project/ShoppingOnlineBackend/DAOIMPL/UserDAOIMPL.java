package com.project.ShoppingOnlineBackend.DAOIMPL;

import java.util.List;

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

	public Address getBillingAddress(int userId) {
		String selectQuery = "FROM Address WHERE userId = :userId AND billing = :isBilling";
		try{
		return sessionFactory
				.getCurrentSession()
					.createQuery(selectQuery,Address.class)
						.setParameter("userId", userId)
						.setParameter("isBilling", true)
						.getSingleResult();
		}
		catch(Exception ex) {
			return null;
		}
	}

	public List<Address> listShippingAddresses(int userId) {
		String selectQuery = "FROM Address WHERE userId = :userId AND shipping = :isShipping ORDER BY id DESC";
		return sessionFactory
				.getCurrentSession()
					.createQuery(selectQuery,Address.class)
						.setParameter("userId", userId)
						.setParameter("isShipping", true)
							.getResultList();
	}

	public Address getAddress(int addressId) {
		try {			
			return sessionFactory.getCurrentSession().get(Address.class, addressId);			
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
			return null;
		}
	}

}
