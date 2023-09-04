package com.anudip.crud.daoimpl;

import java.util.Scanner;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.anudip.crud.config.HibernateUtil;
import com.anudip.crud.dao.CustomerDao;
import com.anudip.crud.entity.Customer;

public class CustomerDaoImpl implements CustomerDao{
	
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void getCustomer() {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
		System.out.println("Enter your customer id");
		int i = sc.nextInt();
		Customer cd = session.get(Customer.class, i);
		System.out.println("--------Customer Details are ---------");
		System.out.println(cd.getCid() + " " + cd.getCname() + " " + cd.getEmail()
		+ " " + cd.getPhone() + " " + cd.getAddr());
		}catch(HibernateException e) {
			System.out.println(e);
		}
	}

	@Override
	public void addCustomer() {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction t = session.beginTransaction();
			String cname, addr, email;
			long phone;
			System.out.println("Enter customer name");
			cname = sc.next();
			System.out.println("Enter customer email");
			email = sc.next();
			System.out.println("Enter customer addr");
			addr = sc.next();
			System.out.println("Enter customer phone");
			phone = sc.nextLong();			
			Customer c1 = new Customer();
			c1.setCname(cname);
			c1.setEmail(email);
			c1.setAddr(addr);
			c1.setPhone(phone);
			
			session.save(c1);
			t.commit();
			System.out.println("inserted successfully");
			
		}catch(HibernateException e) {
			System.out.println(e);
		}
		
	}

	@Override
	public void updateCustomer() {
	try {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		System.out.println("Enter your customer id");
		int i = sc.nextInt();
		Customer cd1 = session.get(Customer.class, i);
		System.out.println("Enter update phone number");
		long p1 = sc.nextLong();
		cd1.setPhone(p1);
		session.update(cd1);
		t.commit();
		System.out.println("updated successfully");		
	}catch(HibernateException e) {
		System.out.println(e);
	}
	}

	@Override
	public void deleteCustomer() {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction t = session.beginTransaction();
			System.out.println("Enter your customer id");
			int i = sc.nextInt();
			Customer cd2 = session.get(Customer.class, i);
			session.delete(cd2);
			t.commit();
			System.out.println("deleted successfully");		
		}catch(HibernateException e) {
			System.out.println(e);
		}
	}

}
