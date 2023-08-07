import java.util.Scanner;

public class ifElseEg {

    static void ifElse() {
        System.out.println("Enter Your marks");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        if (marks >= 35) {
            System.out.println("Congratulatons..... You are pass");
        } else {
            System.out.println("You are fails Better Luck next time.........");
        }
    }

    public static void main(String[] args) {

        ifElse();
    }
}
