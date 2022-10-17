package com.tns.services;


import com.tns.entities.College;
import com.tns.repository.CollegeRepository;
import com.tns.repository.CollegeRepositoryImpl;

public class CollegeServiceImpl implements CollegeService{

	private CollegeRepository dao;
	
	public CollegeServiceImpl() {
		dao=new CollegeRepositoryImpl();
	}
	
	@Override
	public College addCollege(College college) {
		dao.beginTransaction();
		dao.addCollege(college);
		dao.commitTransaction();
		return null;
	}

	@Override
	public College searchCollege(College college) {
		dao.beginTransaction();
		dao.addCollege(college);
		dao.commitTransaction();
		return null;
	}

	@Override
	public College updateCollege(College college) {
		dao.beginTransaction();
		dao.updateCollege(college);
		dao.commitTransaction();
		return null;
	}

	@Override
	public boolean deleteCollege(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public College schedulePlacement(College college) {
		// TODO Auto-generated method stub
		return null;
	}

}