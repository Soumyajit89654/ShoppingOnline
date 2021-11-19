package com.project.ShoppingOnlineBackend;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.project.ShoppingOnlineBackend.DAO.UserDAO;
import com.project.ShoppingOnlineBackend.model.Address;
import com.project.ShoppingOnlineBackend.model.User;

public class UserTest {


	private static AnnotationConfigApplicationContext context;
	static User user;
	static UserDAO userDAO;
	static Address address;
	@BeforeClass
	public static void init() 
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.project.ShoppingOnlineBackend");
		context.refresh();
		
		userDAO = (UserDAO)context.getBean("userDAO");
	}
	@Test
	public void testAddUser()
	{
		user = new User();
		user.setFirstName("Sonu");
		user.setLastName("Maity");
		user.setEmail("sonu@gmail.com");
		user.setContactNumber("9874875630");
		user.setRole("USER");
		user.setPassword("12345678");
		assertEquals("Error",true,userDAO.addUser(user));
		
		address=new Address();
		address.setAddressLineOne("Baishnabghata Patuli,j-190");
		address.setAddressLineTwo("Garia Station,Road-Em-Bypass");
		address.setCity("Kolkata");
		address.setState("West Bengal");
		address.setCountry("India");
		address.setPostalCode("700094");
		address.setBilling(true);
		address.setUserId(user.getId());
		assertEquals("Error",true,userDAO.addAddress(address));

	}
}
