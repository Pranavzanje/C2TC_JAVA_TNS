package com.tns.client;

import com.tns.entities.Admin;
import com.tns.services.*;


public class AdminMain {

	public static void main(String[] args) {
		//Debug this program as Debug -> Debug as Java Application

				AdminService service = new AdminServiceImpl();
				Admin admin = new Admin();
		// Create Operation
				admin.setId(1);;
				admin.setName("Pranav");
				admin.setPassword("Pranav Zanje");
				service.addAdmin(admin);
	}
}
