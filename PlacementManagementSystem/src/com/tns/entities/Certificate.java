package com.tns.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="certificate")
public class Certificate {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	int year;
	String college;
	
	/*
	 * @OneToOne(mappedBy="certificate") private Student student;
	 * 
	 * 
	 * public Student getStudent() { return student; }
	 * 
	 * public void setStudent(Student student) { this.student = student; }
	 */
	public Certificate() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	
	
	
	
}