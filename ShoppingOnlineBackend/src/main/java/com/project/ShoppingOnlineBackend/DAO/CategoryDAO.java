package com.project.ShoppingOnlineBackend.DAO;

import java.util.List;

import com.project.ShoppingOnlineBackend.model.Category;

public interface CategoryDAO {

	Category getCategory(int id);
	List<Category> categoryList();
	boolean addCategory(Category category);
	boolean updateCategory(Category category);
	boolean deleteCategory(Category category);
}
