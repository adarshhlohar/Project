package com.book;

import java.util.Scanner;

import com.daoimpl.BookDAOImpl;
import com.entity.Book;


public class TestBook {
	public static void main(String[] args) {
		BookDAOImpl simpl = new BookDAOImpl();
		Scanner sc = new Scanner(System.in);
	
	while(true){
		System.out.println("1.Read\n2.Add\n3.Update\n4.Delete");
		
		System.out.println("Enter youre Choice");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Student details : ");
			simpl.fetchBookDetails();
			break;
		case 2:
			System.out.println("Enter book id");
			int bookid = sc.nextInt();
			System.out.println("Enter book name");
			String bookname= sc.next();
			System.out.println("Enter book auther name");
			String bookauthor = sc.next();
			System.out.println("Enter year of Publish book");
			int bookpublish = sc.nextInt();
			
	
			Book b1 = new Book(bookid, bookname,bookauthor,bookpublish);
			boolean isadded = simpl.addBook(b1);
			if(isadded) {
				System.out.println("Inserted Successfully");
			}else {
				System.out.println("Failed");
			}
			break;
		case 3:
			System.out.println("Book Update DDetails");
			boolean isUpdated = simpl.updateBook();
			if(isUpdated) {
				System.out.println("Updated");
			}
			else {
				System.out.println("Failed");
			}
			break;
		case 4 :
			System.out.println("Student Delete detail");
			boolean isDeleted = simpl.deleteBook();
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

