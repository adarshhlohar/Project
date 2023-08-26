import java.util.Scanner;

class Subject {
    String name;
    int marks;

    public Subject(String name) {
        this.name = name;
        this.marks = 0;
    }
}

class Student {
    String name;
    String rollNumber;
    Subject[] subjects;

    public Student(String name, String rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.subjects = new Subject[]{new Subject("Maths"), new Subject("English")};
    }
}

class Teacher {
    public void setMarks(Student student, int subjectIndex, int marks) {
        if (subjectIndex >= 0 && subjectIndex < student.subjects.length) {
            student.subjects[subjectIndex].marks = marks;
        } else {
            System.out.println("Invalid subject index");
        }
    }
}

public class Student1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[10];
        for (int i = 0; i < 10; i++) {
            students[i] = new Student("Student " + (i + 1), "Roll" + (i + 1));
        }

        Teacher teacher = new Teacher();

        for (Student student : students) {
            System.out.println("Enter marks for " + student.name + " (" + student.rollNumber + "):");
            for (int i = 0; i < student.subjects.length; i++) {
                System.out.print(student.subjects[i].name + " marks: ");
                int marks = scanner.nextInt();
                teacher.setMarks(student, i, marks);
            }
        }

        System.out.println("\nTeacher's Options:");
        System.out.println("a> Find average of marks");
        System.out.println("b> Find Max and Min and display the marks");

        char option = scanner.next().charAt(0);

        if (option == 'a') {
            int totalMarks = 0;
            int totalSubjects = 0;
            for (Student student : students) {
                for (Subject subject : student.subjects) {
                    totalMarks += subject.marks;
                    totalSubjects++;
                }
            }
            double average = (double) totalMarks / totalSubjects;
            System.out.println("Average marks: " + average);
        } else if (option == 'b') {
            for (Student student : students) {
                for (Subject subject : student.subjects) {
                    System.out.println(student.name + "'s " + subject.name + " marks: " + subject.marks);
                }
            }

            int maxMarks = Integer.MIN_VALUE;
            int minMarks = Integer.MAX_VALUE;
            for (Student student : students) {
                for (Subject subject : student.subjects) {
                    maxMarks = Math.max(maxMarks, subject.marks);
                    minMarks = Math.min(minMarks, subject.marks);
                }
            }
            System.out.println("Max marks: " + maxMarks);
            System.out.println("Min marks: " + minMarks);
        } else {
            System.out.println("Invalid option");
        }

        scanner.close();
    }
}
