package com.Anudip;

import java.util.Scanner;

import com.Anudip.daoimpl.EmployeeDaoImpl;


public class App 
{
    public static void main( String[] args )
    {
    	char a;
        EmployeeDaoImpl eimpl = new EmployeeDaoImpl();
        
        do {
     	  Scanner sc = new Scanner(System.in);
     	  System.out.println("Employee register");
     	  System.out.println("1.Read 2.Add 3.Update 4.Delete 5.Exit");
     	  System.out.println("Enter choice");
     	  int ch = sc.nextInt();
     	  switch(ch) {
     	  case 1:{
     		  eimpl.readEmp();
     		  break;
     	  }
     	  case 2:{
     		  eimpl.addEmp();
     		  break;
     	  }
     	  case 3:{
     		  eimpl.updateEmp();
     		  break;
     	  }
     	  case 4:{
     		  eimpl.deleteEmp();
     		  break;
     	  }
     	  case 5:
     		  System.exit(0);
     		  break;
     	  }
     	  System.out.println("Do you want to continue Y/N ?");
     	  a = sc.next().charAt(0);
     	  sc.close();
        }while(a== 'Y' || a=='y');
        System.out.println("Thanks. ");
     }
}

