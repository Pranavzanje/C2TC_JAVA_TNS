package com.tns.services;

import com.tns.entities.Student;

public interface StudentService {
	public abstract void addStudent(Student student);

	public abstract void updateStudent(Student student);

	public abstract Student searchStudentbyId(int id);

	public abstract Student searchStudentByHallTicket(int ticketno);

	public abstract void addCertificate(Student student);

	public abstract void updateCertificate(Student student);

	public abstract void deleteStudent(int id);


}