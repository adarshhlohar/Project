import java.util.Scanner;

class nestedIfElse {

    static void calc_passfail(int marks) {
        if (marks >= 1 && marks <= 100) {
            if (marks >= 35 && marks <= 45) {
                System.out.println("Youre are graded with D");
            } else if (marks > 45 && marks <= 55) {
                System.out.println("Youre are graded with C");
            } else if (marks > 55 && marks <= 65) {
                System.out.println("Youre are graded with B");
            } else if (marks > 65 && marks <= 80) {
                System.out.println("Youre are graded with A");
            } else if (marks > 80 && marks <= 99) {
                System.out.println("Youre are graded with O");
            } else {
                System.out.println("Youre fail....... Better luck next time");
            }
        } else {
            System.out.println("Absent or Incorrect marks.....");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter youre Marks");
        int marks = sc.nextInt();
        calc_passfail(marks);
    }
}