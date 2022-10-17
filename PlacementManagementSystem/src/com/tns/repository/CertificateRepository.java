package com.tns.repository;


import com.tns.entities.Certificate;

public interface CertificateRepository {

	public abstract void addCertificate(Certificate certificate);
	
	public abstract void updateCertificate(Certificate certificate);
	
	public abstract void deleteCertificate(int id);
	
	public abstract void searchCertificate(int id);
	
	public abstract void beginTransaction();
	
	public abstract void commitTransaction();
	
	

}