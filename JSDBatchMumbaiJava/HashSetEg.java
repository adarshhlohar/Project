package myProgram;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        HashSet<Integer> hs = new HashSet<>();
		        hs.add(10);
		        hs.add(20);
		        hs.add(30);
		        hs.add(40);
		        hs.add(50);
		        hs.add(60);
		        hs.add(70);
		        hs.add(null);  //at least one null element allow
		        hs.add(20);    //duplicate element not allowed

		        Iterator<Integer> itr = hs.iterator();

		        System.out.println("Using the iterator");
		        while (itr.hasNext()) {
		            System.out.print(itr.next() + " ");
		        }
		    }

}


