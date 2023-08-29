package com.Student;


import java.util.Scanner;

import com.entity.Student;

import daoimpl.StudentDAOImpl;

public class TestStudent {
	public static void main(String[] args) {
		StudentDAOImpl simpl = new StudentDAOImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Student Resister");
		
		while(true) {
			System.out.println("1.Read\n2.Add\n3.Update\n4.Delete");
			
			System.out.println("Enter youre Choice");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Student details : ");
				simpl.fetchStudentDetails();
				break;
			case 2 : 
				System.out.println("Enter id");
				int sid = sc.nextInt();
				System.out.println("Enter name");
				String sname= sc.next();
				System.out.println("Enter addr");
				String saddr = sc.next();
				System.out.println("Enter email");
				String semail = sc.next();
				System.out.println("Enter phone");
				long sphone = sc.nextLong();
				System.out.println("Enter education");
				String seduc = sc.next();
		
				Student student = new Student(sid,sname, saddr, semail, sphone, seduc);
				boolean isadded = simpl.addStudent(student);
				if(isadded) {
					System.out.println("Inserted Successfully");
				}else {
					System.out.println("Failed");
				}
				break;
			case 3:
				System.out.println("Student Update DDetails");
				boolean isUpdated = simpl.updateStudent();
				if(isUpdated) {
					System.out.println("Updated");
				}
				else {
					System.out.println("Failed");
				}
				break;
			case 4 :
				System.out.println("Student Delete detail");
				boolean isDeleted = simpl.deleteStudent();
				if(isDeleted) {
					System.out.println("Deleted");
				}
				else {
					System.out.println("Failed");
				}
				break;
			case 5:
				System.out.println("Thanks");
				System.exit(0);
			}
		}
	}
}
