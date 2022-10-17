package com.tns.services;


import com.tns.entities.Placement;
import com.tns.repository.PlacementRepository;
import com.tns.repository.PlacementRepositoryImpl;

public class PlacementServiceImpl implements PlacementService {
	
	private PlacementRepository dao;
	
	public PlacementServiceImpl() {
		
		dao = new PlacementRepositoryImpl();
	}

	@Override
	public Placement addPLacement(Placement placement) {
		dao.beginTransaction();
		dao.addPlacement(placement);
		dao.commitTransaction();
		return null;
	}

	@Override
	public Placement updateLacement(Placement placement) {
		dao.beginTransaction();
		dao.updatePlacement(placement);
		dao.commitTransaction();
		return placement;
	}

	@Override
	public Placement searchPLacement(int id) {
		dao.beginTransaction();
		dao.searchPlacement(id);
		dao.commitTransaction();
		return null;
	}

	@Override
	public boolean cancelPLacement(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}