package com.tns.repository;



import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.tns.entities.Student;

public class StudentRepositoryImpl implements StudentRepository {

	private EntityManager entityManager;

	public StudentRepositoryImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public Student searchStudentById(int id) {
		Student student = entityManager.find(Student.class, id);
		return student;
	}

	@Override
	public void addStudent(Student student) {
		entityManager.persist(student);

	}

	@Override
	public boolean deleteStudent(int id) {
		Student student = entityManager.find(Student.class, id);
		entityManager.remove(student);
		return true;
	}

	@Override
	public void updateStudent(Student student) {
		entityManager.merge(student);

	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();

	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();

	}

	@Override
	public Student searchStudentByhallTicket(int ticketno) {
		Query query = entityManager.createNamedQuery("searchStudentByhallTicket");
				Student student= (Student) query.getSingleResult();

		return student;
	}

}