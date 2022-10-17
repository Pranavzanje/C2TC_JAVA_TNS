package com.tns.repository;


import javax.persistence.EntityManager;

import com.tns.entities.College;


public class CollegeRepositoryImpl implements CollegeRepository{

	private EntityManager entityManager;
	
	public CollegeRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
	}
	@Override
	public College addCollege(College college) {
		entityManager.persist(college);
		return college;
	}

	@Override
	public College updateCollege(College college) {
		entityManager.merge(college);
		return college;
	}

	@Override
	public College searchCollege(int id) {
		College college = entityManager.find(College.class,id);
		return college;
	}

	@Override
	public boolean deleteCollege(int id) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();;
		
	}
	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}
	
}