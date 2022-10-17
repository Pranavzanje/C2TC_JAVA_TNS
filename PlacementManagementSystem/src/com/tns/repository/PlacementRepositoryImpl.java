package com.tns.repository;

import javax.persistence.EntityManager;

import com.tns.entities.Placement;

public class PlacementRepositoryImpl implements PlacementRepository {

	private EntityManager entityManager;

	public PlacementRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public Placement addPlacement(Placement placement) {
		entityManager.persist(placement);
		return placement;
	}

	@Override
	public Placement updatePlacement(Placement placement) {
		entityManager.merge(placement);
		return placement;
	}

	@Override
	public Placement searchPlacement(int id) {
		entityManager.find(Placement.class, id);
		return null;
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