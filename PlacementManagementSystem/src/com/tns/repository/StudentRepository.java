package com.tns.repository;


import com.tns.entities.Student;

public interface StudentRepository {
	public abstract Student searchStudentById(int id);

	public abstract Student searchStudentByhallTicket(int ticketno);

	public abstract void addStudent(Student student);

	public abstract boolean deleteStudent(int id);

	public abstract void updateStudent(Student student);

	public abstract void commitTransaction();

	public abstract void beginTransaction();
}