package com.project.ShoppingOnlineBackend.DAO;

import java.util.List;

import com.project.ShoppingOnlineBackend.model.Cart;
import com.project.ShoppingOnlineBackend.model.Cartline;

public interface CartLineDAO {


	public List<Cartline> list(int cartId);
	public Cartline get(int id);	
	public boolean add(Cartline cartLine);
	public boolean update(Cartline cartLine);
	public boolean remove(Cartline cartLine);
	
	// fetch the CartLine based on cartId and productId
	public Cartline getByCartAndProduct(int cartId, int productId);		
		
	// updating the cart
	boolean updateCart(Cart cart);
	
	// list of available cartLine product
	public List<Cartline> listAvailable(int cartId);
	
}
