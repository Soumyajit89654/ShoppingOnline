package com.project.ShoppingOnlineBackend.DAO;

import com.project.ShoppingOnlineBackend.model.User;
import com.project.ShoppingOnlineBackend.model.Address;
import com.project.ShoppingOnlineBackend.model.Cart;

public interface UserDAO {

	boolean addUser(User user);
	User getByEmail(String email) ;
	
	boolean addAddress(Address address);
	boolean updateCart(Cart cart);
}
