package com.tns.client;


import java.time.LocalDate;


import com.tns.entities.*;
import com.tns.services.*;

public class StudentMain {

	public static void main(String[] args) {

		StudentService service = new StudentServiceImpl();
		PlacementService pservice = new PlacementServiceImpl();
		UserService uservice = new UserServiceImpl();

		Student student = new Student();

		student.setName("Inzamam");
		student.setRoll(22);
		student.setQualification("B.E");
		student.setCourse("Engineering");
		student.setYear(2022);
		student.setHallTicketNo(101);

		Certificate certificate = new Certificate();

		certificate.setCollege("Apcoer");
		certificate.setYear(2022);

		College college = new College();

		college.setCollegeAdmin("Abhineel");
		college.setCollegeName("Apcoer");
		college.setLocation("Pune");

		Placement placement = new Placement();

		placement.setName("Google");
		placement.setDate(LocalDate.now());
		placement.setQualification("B.E");
		placement.setYear(2022);

		Admin admin = new Admin();
//
//		admin.setName("Inzamam");
//		admin.setPassword("123456789");

		User user = new User();

		user.setName("Abhineel");
		user.setPassword("987654321");

		student.setCollege(college);
		placement.setCollege(college);
		student.setCertificate(certificate);
		user.setAdmin(admin);

		// cservice.addCertificate(certificate); 
		service.addStudent(student);
		pservice.addPLacement(placement);
		uservice.addUser(user);

		service.searchStudentByHallTicket(101);

		/*
		 * System.out.print("ID:" + student.getId()); System.out.println(" Name:" +
		 * student.getName()); System.out.println("College:" + student.getCollege());
		 * System.out.println("Roll:" + student.getRoll());
		 * System.out.println("Qualification:" + student.getQualification());
		 * System.out.println("Course:" + student.getCourse());
		 * System.out.println("Year:" + student.getYear());
		 * System.out.println("Certificate:" + student.getCertificate());
		 * System.out.println("HallTicketNo:" + student.getHallTicketNo());
		 */

		System.out.println("End of program/Life cycle completed...");
	}
}

		
