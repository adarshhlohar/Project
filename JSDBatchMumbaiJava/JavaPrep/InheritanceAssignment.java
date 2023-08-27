class Person{
    String name;
    int age;

    public void speak(){
        System.out.println("The person is Speaking........");
    }
}

class Student extends Person{
    double grade;

    public void study(){
        System.out.println("the student id studying........");
    }
}

public class InheritanceAssignment {
    public static void main(String[] args) {
        Student std = new Student();
        std.name = "Adarsh";
        std.grade = 9.9;
        std.age = 22;

        // calling method
        std.study();
        std.speak();
    }
}
