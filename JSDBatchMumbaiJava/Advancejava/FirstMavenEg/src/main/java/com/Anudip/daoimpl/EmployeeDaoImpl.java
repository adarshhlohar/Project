package com.Anudip.daoimpl;

import java.util.Scanner;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Anudip.config.HibernateUtil;
import com.Anudip.dao.EmployeeDao;
import com.Anudip.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	Scanner sc = new Scanner(System.in);
	
	@Override
	public void addEmp() {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			System.out.println("session : " + session);
			Transaction t = (Transaction) session.beginTransaction();
			
			String empName,empSurname,empaddr,designation;
			long phone;
			
			System.out.println("Enter name");
			empName = sc.next();
			
			System.out.println("Enter surName");
			empSurname = sc.next();
			
			System.out.println("Enter phone no");
			 phone = sc.nextLong();
			 
			 System.out.println("Enter Address");
			empaddr = sc.next();
			
			System.out.println("Enter designation");
			designation = sc.next();
			
			Employee e= new Employee(empName, empSurname, phone, empaddr, designation);
			session.save(e); //employee detail get save  in db table
			t.commit();  //permenently save
			System.out.println("successfully saved");
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public void updateEmp() {
		
	}

	@Override
	public void deleteEmp() {
		
	}

	@Override
	public void readEmp() {
		
	}
	
}
