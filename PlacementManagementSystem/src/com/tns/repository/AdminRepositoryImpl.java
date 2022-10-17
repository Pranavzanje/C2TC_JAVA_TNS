package com.tns.repository;


import javax.persistence.EntityManager;

import com.tns.entities.Admin;

public class AdminRepositoryImpl implements AdminRepository {
	private EntityManager entityManager;

	public AdminRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public Admin getAdminById(int id) {
		Admin admin = entityManager.find(Admin.class, id);
		return admin;
	}

	@Override
	public void addAdmin(Admin admin) {
		entityManager.persist(admin);

	}

	@Override
	public void removeAdmin(Admin admin) {
		entityManager.remove(admin);

	}

	@Override
	public void updateAdmin(Admin admin) {
		entityManager.merge(admin);

	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();

	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();

	}

}