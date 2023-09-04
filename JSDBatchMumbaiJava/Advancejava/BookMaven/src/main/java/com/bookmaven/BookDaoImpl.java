package com.bookmaven;

import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class BookDaoImpl implements BookDao {
	Scanner sc = new Scanner(System.in);

	@Override
	public void addBook() {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction t = session.beginTransaction();
			String bName, bAuthor;
			long bPublish;
			System.out.println("Enter Book name");
			bName = sc.next();
			System.out.println("Enter Author Name");
			bAuthor = sc.next();
			System.out.println("Enter publish year of book");
			bPublish = sc.nextLong();
			Book c1 = new Book();
			c1.setBookName(bName);
			c1.setBookAuthor(bAuthor);
			c1.setBookPublish(bPublish);

			session.save(c1);
			t.commit();
			System.out.println("inserted successfully");

		} catch (HibernateException e) {
			System.out.println(e);
		}
	}

	@Override
	public void updateBook() {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction t = session.beginTransaction();
			System.out.println("Enter your customer id");
			int i = sc.nextInt();
			Book b1 = session.get(Book.class, i);
			System.out.println("Enter update year of publish");
			long publishYear = sc.nextLong();
			b1.setBookPublish(publishYear);
			session.update(b1);
			t.commit();
			System.out.println("updated successfully");
		} catch (HibernateException e) {
			System.out.println(e);
		}
	}

	@Override
	public void readBook() {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			System.out.println("Enter your customer id");
			int i = sc.nextInt();
			Book b = session.get(Book.class, i);
			System.out.println("--------Customer Details are ---------");
			System.out.println(
					b.getBookid() + " " + b.getBookName() + " " + b.getBookAuthor() + " " + b.getBookPublish());
		} catch (HibernateException e) {
			System.out.println(e);
		}
	}

	@Override
	public void deleteBook() {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction t = session.beginTransaction();
			System.out.println("Enter your customer id");
			int i = sc.nextInt();
			Book b2 = session.get(Book.class, i);
			session.delete(b2);
			t.commit();
			System.out.println("deleted successfully");
		} catch (HibernateException e) {
			System.out.println(e);
		}
	}

}
