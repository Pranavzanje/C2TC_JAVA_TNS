package com.tns.services;

import com.tns.entities.Certificate;
import com.tns.repository.CertificateRepository;
import com.tns.repository.CertificateRepositoryImpl;


public class CertificateServiceImpl implements CertificateService  {
	
private CertificateRepository repo;
	
	
	public CertificateServiceImpl() {
		repo=new CertificateRepositoryImpl();
	}

	@Override
	public void addCertificate(Certificate certificate) {
		repo.beginTransaction();
		repo.addCertificate(certificate);
		repo.commitTransaction();
		
	}

	@Override
	public void updateCertificate(Certificate certificate) {
		repo.beginTransaction();
		repo.updateCertificate(certificate);
		repo.commitTransaction();
		
	}

	@Override
	public void deleteCertificate(int id) {
		repo.beginTransaction();
		repo.deleteCertificate(id);
		repo.commitTransaction();
		
	}

	@Override
	public void searchCertificate(int id) {
		repo.beginTransaction();
		repo.searchCertificate(id);
		repo.commitTransaction();
		
	}

}