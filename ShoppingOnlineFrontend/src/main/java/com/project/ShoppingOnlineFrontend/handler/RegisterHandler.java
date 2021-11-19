package com.project.ShoppingOnlineFrontend.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.stereotype.Component;

import com.project.ShoppingOnlineBackend.DAO.UserDAO;
import com.project.ShoppingOnlineBackend.model.Address;
import com.project.ShoppingOnlineBackend.model.User;
import com.project.ShoppingOnlineFrontend.model.RegisterModel;

@Component("registerHandler")
public class RegisterHandler
{
	 @Autowired
     UserDAO userDAO;
	public RegisterModel init()
	{
		return new RegisterModel();
	}
	public void addUser(RegisterModel registerModel, User user) 
	{
	      registerModel.setUser(user);
	}
	public void addAddress(RegisterModel registerModel, Address billing) 
	{
		registerModel.setBilling(billing);
	}
	public String validate(User user , MessageContext error)
	{
		String tranResult = "success";
          if(!(user.getPassword().equals(user.getConfirmPassword())))
          {
        	  error.addMessage(new MessageBuilder()
  					.error()
  					.source("confirmPassword")
  					.defaultText("Password does not match confirm password!")
  					.build());
  			
  			 tranResult = "failure"; 
          }
          if(userDAO.getByEmail(user.getEmail())!=null)
          {
        	  error.addMessage(new MessageBuilder()
  					.error()
  					.source("email")
  					.defaultText("E-mail already taken!")
  					.build());
  			
  			 tranResult = "failure";  
          }
          
		return tranResult;
	}
	
}
