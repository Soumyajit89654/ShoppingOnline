package com.project.ShoppingOnlineBackend;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.project.ShoppingOnlineBackend.DAO.CategoryDAO;
import com.project.ShoppingOnlineBackend.model.Category;

public class CategoryTest {

	private static AnnotationConfigApplicationContext context;
	static Category category;
	static CategoryDAO categoryDAO;
	

	@BeforeClass
	public static void init() 
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.project.ShoppingOnlineBackend");
		context.refresh();
		
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
	}
	/*
	@Test
	public void testAddCategory()
	{
		category = new Category();
		category.setCategoryName("COOLER");
		category.setDescription("New Model  Category");
		category.setActive(true);
		
		assertEquals("Error adding category",true,categoryDAO.addCategory(category));
	}*/
	/*
	@Test
	public void testDeleteCategory()
	{
		category=categoryDAO.getCategory(34);
		category.setCategoryName("COOLERS");
		assertEquals("Error",true,categoryDAO.deleteCategory(category));
	}
	*/
	 @Test
	public void testUpdateCategory()
	{
		category=categoryDAO.getCategory(2);
		category.setCategoryName("TELEVISION");
		assertEquals("Error",true,categoryDAO.updateCategory(category));
	}
	
}
