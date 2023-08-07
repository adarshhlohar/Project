class Teacher{
    String tname;
    String temail;
    long phone;

    Teacher(String tname, String temail, long phone){
        this.tname = tname;
        this.temail = temail;
        this.phone = phone;
    }
}


class Student{
    int sid;
    String sname;
    String seduc;
    String semail;
    long phonee;
    String saddr;
    Teacher teacher;

    Student(String sname, int sid, String seduc, String semail, String saddr, long phonee, Teacher teacher){
        this.sid = sid;
        this.sname = sname;
        this.seduc = seduc;
        this.semail = semail;
        this.phonee = phonee;
        this.saddr = saddr;
        this.teacher = teacher;
    }
    void display(){
        System.out.println("Student values are");
        System.out.println(sid + " " + sname + " " + seduc + " " + semail + " " + saddr + " " + phonee );
        System.out.println("Teacher avlues are :");
        System.out.println(teacher.tname + " "  + teacher.temail + " " + teacher.phone);
    }
}


public class AggregationEg {
    public static void main(String[] args) {
        Teacher t = new Teacher("adarsh", "T@gamil.com", 9324589574l);
        Student s1 = new Student("Addi", 101, "be", "adarshhlohar@gmail.com", "pune", 9356986567l, t);
        Student s2 = new Student("Addi1", 102, "ME", "adarshhlohar2@gmail.com", "pune2", 9356986567l, t);
        s1.display();;
        s2.display();
    }
}
