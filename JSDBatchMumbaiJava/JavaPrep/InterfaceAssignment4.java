// Create an interface called "Person" with a method called "speak". Create two classes called "Student" and "Teacher" that implement the Person interface and implement the "speak" method. Create objects of both the Student and Teacher classes and call their respective "speak" methods.

interface Person{
    void speak();
}

class Student implements Person{
    public void speak(){
        System.out.println("the student is speaking.......");
    }
}

class Teacher implements Person{
    public void speak(){
        System.out.println("the teacher is speaking.......");
    }
}

public class InterfaceAssignment4 {
    public static void main(String[] args) {
        Student std = new Student();
        std.speak();

        Teacher Pt = new Teacher();
        Pt.speak();
    }
}
