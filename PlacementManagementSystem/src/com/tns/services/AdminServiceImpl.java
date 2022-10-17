package com.tns.services;


import com.tns.entities.Admin;
import com.tns.repository.AdminRepository;
import com.tns.repository.AdminRepositoryImpl;

public class AdminServiceImpl implements AdminService {
	private AdminRepository dao;

	public AdminServiceImpl() {
		dao = new AdminRepositoryImpl();
	}

	@Override
	public void addAdmin(Admin admin) {
		dao.beginTransaction();
		dao.addAdmin(admin);
		dao.commitTransaction();

	}

	@Override
	public void updateAdmin(Admin admin) {
		dao.beginTransaction();
		dao.updateAdmin(admin);
		dao.commitTransaction();

	}

	@Override
	public void removeAdmin(Admin admin) {
		dao.beginTransaction();
		dao.removeAdmin(admin);
		dao.commitTransaction();
	}

	@Override
	public Admin findAdminById(int id) {
//no need of transaction, as it's an read operation
		Admin admin = dao.getAdminById(id);
		return admin;
	}

}