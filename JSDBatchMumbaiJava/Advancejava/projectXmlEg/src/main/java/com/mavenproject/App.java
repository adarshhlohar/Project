package com.mavenproject;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Student st = new Student();
    	st.setId(101);
    	st.setName("Adarsh");
    	st.setCity("Pune");
    	
    	System.out.println(st);
    }
}
