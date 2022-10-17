package com.tns.repository;

import javax.persistence.EntityManager;

import com.tns.entities.Certificate;

public class CertificateRepositoryImpl implements CertificateRepository{
	
private EntityManager entityManager;
	
	
	public CertificateRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
	}


	@Override
	public void addCertificate(Certificate certificate) {
		entityManager.persist(certificate);
		
	}

	@Override
	public void updateCertificate(Certificate certificate) {
		entityManager.merge(certificate);
		
	}

	@Override
	public void deleteCertificate(int id) {
		Certificate certificate=entityManager.find(Certificate.class,id);
		entityManager.remove(certificate);
	}

	@Override
	public void searchCertificate(int id) {
		entityManager.find(Certificate.class,id);
		
	}


	@Override
	public void beginTransaction() {
	entityManager.getTransaction().begin();
		
	}


	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}

}