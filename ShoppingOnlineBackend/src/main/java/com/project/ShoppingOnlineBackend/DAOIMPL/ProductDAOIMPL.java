package com.project.ShoppingOnlineBackend.DAOIMPL;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project.ShoppingOnlineBackend.DAO.ProductDAO;
import com.project.ShoppingOnlineBackend.model.Product;

@Repository("productDAO")
@Transactional
public class ProductDAOIMPL implements ProductDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public Product getProduct(int productId) {
	
		return sessionFactory.getCurrentSession().get(Product.class,Integer.valueOf(productId));

	}

	public List<Product> productList() {
		
		return sessionFactory
				.getCurrentSession()
				.createQuery("FROM Product" , Product.class)
				.getResultList();
	}

	public boolean addProduct(Product product) {
		
		try 
		{	
			product.setActive(true);
			sessionFactory.getCurrentSession().persist(product);
			return true;
		}
		catch(Exception ex) 
		{		
			ex.printStackTrace();
			return false;
		}	
	}

	public boolean updateProduct(Product product) {
		
		try 
		{			
			sessionFactory.getCurrentSession().update(product);
			return true;
		}
		catch(Exception ex) 
		{		
			ex.printStackTrace();
			return false;	
		}
	}

	public boolean deleteProduct(Product product) {
		
		try 
		{
			product.setActive(false);
			sessionFactory.getCurrentSession().update(product);
			return true;
		}
		catch(Exception ex) 
		{		
			ex.printStackTrace();
			return false;
		}
	}

	public List<Product> listActiveProducts() {
		
		String selectActiveCategory = "FROM Product WHERE active = :active";
		Query query = sessionFactory.getCurrentSession().createQuery(selectActiveCategory);		
		query.setParameter("active", true);			
		return query.getResultList();
	}

	public List<Product> listActiveProductsByCategory(int categoryId) {
		
		String selectActiveProductsByCategory = "FROM Product WHERE active = :active AND categoryId = :categoryId";
		Query query = sessionFactory.getCurrentSession().createQuery(selectActiveProductsByCategory);
		query.setParameter("active", true);
		query.setParameter("categoryId",categoryId);
		
		return query.getResultList();
	}

	public List<Product> getProductsByParam(String param, int count) {

		String query = "FROM Product WHERE active = true ORDER BY " + param + " DESC";
		
		return sessionFactory
					.getCurrentSession()
					.createQuery(query,Product.class)
					.setFirstResult(0)
					.setMaxResults(count)
					.getResultList();
	}

}
