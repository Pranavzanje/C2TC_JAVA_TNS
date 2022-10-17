package com.tns.repository;
import com.tns.entities.Admin;

public interface AdminRepository {
	public abstract Admin getAdminById(int id);

	public abstract void addAdmin(Admin admin);

	public abstract void removeAdmin(Admin admin);

	public abstract void updateAdmin(Admin admin);

	public abstract void commitTransaction();

	public abstract void beginTransaction();

	
}