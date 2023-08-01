import java.util.Scanner;

public class ifElseExample {

    void ifElse(int age) {
        if (age < 0 && age > 100) {
            System.out.println("This is an invalid age");
        } else if (age < 9) {
            System.out.println("You are a kid and you cannot even think of driving");
        } else if (age < 18 && age >= 9) {
            System.out.println("You are a kid and you can think of driving after 18");
        } else {
            System.out.println("You can now drive as you are above 18");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Hey whats youre age?");
        age = sc.nextInt();
        ifElseExample obj = new ifElseExample();
        obj.ifElse(age);
    }
}
