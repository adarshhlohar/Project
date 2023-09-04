package com.anudip.crud;

import java.util.Scanner;

import com.anudip.crud.daoimpl.CustomerDaoImpl;

public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        CustomerDaoImpl cdao = new CustomerDaoImpl();
        char a;
        do {
        	Scanner sc = new Scanner(System.in);
        	System.out.println("----------Customer Management-----------");
        	System.out.println("Enter your choice");
        	System.out.println("1.Read \n 2.Add \n 3.Update \n 4.Delete \n 5.Exit");
        	int ch = sc.nextInt();
        	switch(ch) {
        	case 1: cdao.getCustomer();
        	break;     	
        	case 2 : cdao.addCustomer();
        	break;       	
        	case 3 : cdao.updateCustomer();
        	break;      	
        	case 4 : cdao.deleteCustomer();
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
