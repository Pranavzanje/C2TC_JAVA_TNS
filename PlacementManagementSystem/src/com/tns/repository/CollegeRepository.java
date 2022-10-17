package com.tns.repository;

import com.tns.entities.College;

public interface CollegeRepository {

	public abstract College addCollege(College college);

	public abstract College updateCollege(College college);

	public abstract College searchCollege(int id);

	public abstract boolean deleteCollege(int id);

	public abstract void commitTransaction();

	public abstract void beginTransaction();

}