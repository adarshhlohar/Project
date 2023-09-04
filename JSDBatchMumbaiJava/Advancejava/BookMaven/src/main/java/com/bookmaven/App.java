package com.bookmaven;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
    	BookDaoImpl std = new BookDaoImpl();
         char a;
         do {
         	Scanner sc = new Scanner(System.in);
         	System.out.println("----------Customer Management-----------");
         	System.out.println("Enter your choice");
         	System.out.println("1.Read \n 2.Add \n 3.Update \n 4.Delete \n 5.Exit");
         	int ch = sc.nextInt();
         	switch(ch) {
         	case 1: std.readBook();
         	break;     	
         	case 2 : std.addBook();
         	break;       	
         	case 3 : std.updateBook();
         	break;      	
         	case 4 : std.deleteBook();
         	break;      	
         	case 5: System.exit(0);
         	break;     	
         	default:
         		System.out.println("invalid entry");
         	}
         	System.out.println("Do you want to continue ? Y/N");
         	a = sc.next().charAt(0);
         }while(a == 'Y' || a == 'y');
         System.out.println("Thank You ........");
    }
}
