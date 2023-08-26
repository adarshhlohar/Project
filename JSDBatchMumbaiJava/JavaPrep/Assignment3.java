import java.util.Scanner;

class Subject{
    String SubName;
    int marks;

    public Subject(String SubName){
        this.SubName = SubName;
        this.marks = 0;
    }
}

class Student{
    String name;
    int roll_no;

    // Creating array object of Subject class
    Subject[] subjects;

    public Student(String name, int roll_no){
        this.name = name;
        this.roll_no = roll_no;

        // After calling the constructor of Student --> The Subject object can be Created and thats constructor is also invoked.
        this.subjects = new Subject[]{new Subject("Math"),new Subject("English")};
    }
}



class Teacher{
        public void setMarks(Student students,int subjectIndex,int marks){
            if (subjectIndex >= 0 && subjectIndex < students.subjects.length) {
                students.subjects[subjectIndex].marks = marks;
            }
        }
}




public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Creating a Student object Array that can store 10 student object
        Student[] students = new Student[10];

        for (int i = 0; i < 10; i++) {
            int temp = i+1;
            // storing the data of that students we are using  for loop for and calling constructor
            students[i] = new Student("student"+(temp) , 1000+temp);
        }

        // creating object of Teacher class
        Teacher teacher = new Teacher();

        // Setting the marks of each student
        for (Student student : students) {
            System.out.println("---Enter the mark of student :" + student.name + " ***Whose roll no is :" + student.roll_no);
            for (int i = 0; i < student.subjects.length; i++) {
                System.out.println("The mark of the subject is : " + student.subjects[i].SubName);
                int mark = sc.nextInt();

                //Setting the marks using the teacher object
                teacher.setMarks(student, i, mark);
            }
        }


        sc.close();
    }
}
