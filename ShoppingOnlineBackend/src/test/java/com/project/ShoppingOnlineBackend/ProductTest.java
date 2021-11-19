package com.project.ShoppingOnlineBackend;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.project.ShoppingOnlineBackend.DAO.ProductDAO;
import com.project.ShoppingOnlineBackend.model.Product;

public class ProductTest {

    private static AnnotationConfigApplicationContext context;
	
	static Product product;
	static ProductDAO productDAO;
	

	@BeforeClass
	public static void init() 
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.project.ShoppingOnlineBackend");
		context.refresh();
		
		productDAO = (ProductDAO)context.getBean("productDAO");
	}
	/*
	@Test
	public void testAddProduct()
	{
		
		product = new Product();
		
		product.setName("Voltas 52 L Desert Air Cooler");
		product.setBrand("Voltas");
		product.setDescription("190 Air Cooler Power Supply [V/Hz/Ph] 230 / 50 / 1 Phase Fan/Blower Diameter[cm] 42 PERFORMANCE Air Cooler Air Throw Distance 10.668  ");
		product.setUnitPrice(10129);
		product.setActive(true);
		product.setCategoryId(5);
		product.setSupplierId(11);
		product.setQuantity(19);
		
		assertEquals("Something went wrong while inserting a new product!",
				true,productDAO.addProduct(product));
		
	}*/
	/*
	@Test
	public void testGetProduct()
	{
		product=productDAO.getProduct(3);
		assertEquals("error fetching product","Lenovo",product.getBrand());
	}*/
	/*@Test
	public void testUpdateProduct()
	{
		product=productDAO.getProduct(3);
		product.setQuantity(9);
		assertEquals("error updating product",true,productDAO.updateProduct(product));
	}*/
	@Test
	public void testDeleteProduct()
	{
		product=productDAO.getProduct(77);
		product.setActive(false);
		assertEquals("error deleting product",true,productDAO.deleteProduct(product));
	}
}
