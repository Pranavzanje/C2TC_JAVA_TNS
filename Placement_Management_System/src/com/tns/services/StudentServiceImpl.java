package com.tns.services;



import com.tns.entities.*;

import com.tns.repository.*;

public class StudentServiceImpl implements StudentService
{

	// Step 1: Establishing connection between Service and Repo
	private StudentRepository dao;
	public StudentServiceImpl() 
	{
		dao = new StudentRepositoryImpl();
	}	
	
	// Step 2: Service calls to perform CRUD Operation
	@Override
	public Student addStudent(Student student) 
	{
      dao.beginTransaction();
      dao.addStudent(student);
      dao.commitTransaction();
		return student;
	}

	@Override
	public Student updateStudent(Student student) {
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
		return student;
	}

	@Override
	public Student searchStudentById(int id) 
	{
		Student student = dao.searchStudentById(id);
		return student;
	}

	@Override
	public Student searchStudentByHallTicket(int hallTicketNo)
	{
		Student student = dao.searchStudentByHallTicket(hallTicketNo);
		return student;
	}

	@Override
	public boolean deleteStudent(int id)
	{
		dao.beginTransaction();
		dao.deleteStudent(id);
		dao.commitTransaction();
		return false;
	}

	@Override
	public boolean addCertificate(Certificate certificate) 
	{
		dao.beginTransaction();
		//dao.addCertificate(certificate);
		dao.commitTransaction();
		return false;
	}

	@Override
	public boolean updateCertificate(Certificate certificate)
	{
		dao.beginTransaction();
		//dao.updateCertificate(certificate);
		dao.commitTransaction();
			return false;
	}

}
