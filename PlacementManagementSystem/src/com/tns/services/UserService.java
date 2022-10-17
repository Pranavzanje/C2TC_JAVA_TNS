package com.tns.services;


import com.tns.entities.*;


public interface UserService 
{
	public User addUser(User user);  
	public User updateUser(User user);  
	public User login(User user);
	public boolean logOut ();

}


