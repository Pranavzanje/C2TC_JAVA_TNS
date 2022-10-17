package com.tns.services;

import com.tns.entities.Certificate;

public interface CertificateService {

public abstract void addCertificate(Certificate certificate);
	
	public abstract void updateCertificate(Certificate certificate);
	
	public abstract void deleteCertificate(int id);
	
	public abstract void searchCertificate(int id);
}
