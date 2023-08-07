class Student{
    int rollNo;
    String name;
    long phoneno;
    String addr;
    char gender;

    // static variable in java
    static String course;

    // static methode in java
    static void show(){
        System.out.println("there is nothing to show");
    }

    void display(){
        System.out.println("My name  "+name+" ,roll no is "+rollNo+" , Phone no is "+phoneno+" , address is "+addr+" and my gender "+ gender + " And I am enroll this " +course + " course.");
    }
}




public class testStudent {
    
    public static void main(String[] args) {
        Student.show();

        Student.course= "Full Stack java";
        System.out.println("The value of course is : "+Student.course);

        Student s1 = new Student();

        s1.rollNo = 21;
        s1.name= "Adarsh";
        s1.addr= "Pune";
        s1.phoneno = 9356986567l;
        s1.gender = 'M';
        s1.display();

    }
}
