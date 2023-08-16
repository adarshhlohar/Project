package activity;

public class StringExample {

	public static void main(String[] args) {


		        String s1 = "Welcome";
		        java.lang.String s2 = "Welcome";// It doesn't create a new instance
		        java.lang.String s3="java";//creating string by Java string literal    
		        char ch[]={'s','t','r','i','n','g','s'};    
		        String s4=new String(ch);//converting char array to string    
		        System.out.println(s1);    
		System.out.println(s2);    
		System.out.println(s3);   
		System.out.println(s4);  
	}

}
