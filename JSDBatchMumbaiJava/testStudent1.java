class Student {	
	//instance variable
	int rollno;
	String name;
	long phoneno;
	String addr;
	char gender;
	
	//static variable
	static String course;
	
	//static method 
	static void show(){
		System.out.println("Student details of JSD batch Mumbai");
	}
	
	//non static method
	void display(){
		System.out.println(rollno + " " + name + " " + phoneno +" "+addr +" "+gender
		+" "+course);
	}
}
//main class
class TestStudent{	
	//entry point
	public static void main(String args[]){
		//access static variable
		Student.course = "Java Full Stack";
		
		//access static method
		Student.show();
		
		Student s1 = new Student(); 	//object creation
		 
		s1.rollno = 12; //access instance variable
		s1.name = "mamta";
		s1.addr = "mumbai";
		s1.phoneno = 98765432;
		s1.gender ='F';
		
		s1.display(); //calling method
		
		Student s2 = new Student(); 	//object creation
		s2.rollno = 13; //access instance variable
		s2.name = "sam";
		s2.addr = "mumbai";
		s2.phoneno = 988765432;
		s2.gender ='M';
		
		s2.display(); //calling method
	}
}