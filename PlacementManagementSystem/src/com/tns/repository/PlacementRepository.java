package com.tns.repository;

import com.tns.entities.Placement;

public interface PlacementRepository {

	public abstract Placement addPlacement(Placement placement);
	
	public abstract Placement updatePlacement(Placement placement);
	
	public abstract Placement searchPlacement(int id);
	
	public abstract void commitTransaction();

	public abstract void beginTransaction();
}