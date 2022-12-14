package com.tns.services;


import com.tns.entities.User;

import com.tns.repository.*;

public class UserServiceImpl implements UserService
	{
		// Step 1: Establishing connection between Service and Repo
		private UserRepository dao;

		public UserServiceImpl() 
		{
			dao = new UserRepositoryImpl();
		}
		// Step 2: Service calls to perform CRUD Operation
		@Override
		public User addUser(User user) 
		{
			dao.beginTransaction();
			dao.addNewUser(user);
			dao.commitTrasaction();
			return user;
		}

		@Override
		public User updateUser(User user)
		{
			dao.beginTransaction();
			dao.updateUser(user);
			dao.commitTrasaction();
			return user;
		}

		@SuppressWarnings("unlikely-arg-type")
		public User login(User user)
		{
			dao.beginTransaction();
			dao.equals(user);
			dao.commitTrasaction();
			return user;
		}

		@Override
		public boolean logOut() 
		{
			dao.beginTransaction();
			dao.commitTrasaction();
			return false;
		}

}