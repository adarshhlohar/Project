abstract class Student {
    String Name;
    int Id;

    abstract void display();
}

class Exam extends Student {
    int physics;
    int chemistry;
    int math;

    Exam(int physics, int chemistry, int math, String Name, int Id) {
        this.Id = Id;
        this.Name = Name;
        this.physics = physics;
        this.chemistry = chemistry;
        this.math = math;
    }

    public void display1() {
        System.out.println(
                "The id of student is : " + Id + " And the name is : " + Name + " The marks of that student is "
                        + "\nPhysics : " + physics + "\nChemistry : " + chemistry + "\nMath : " + math);
    }
}

public class abstractStudentClass {
    Exam s1 = new Exam(98,95,99,"Adarsh",121);
    s1.display();
}
