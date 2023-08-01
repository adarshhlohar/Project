import java.util.Scanner;

public class doWhileEg {

    static void doWhile(int num) {
        int i = 1;
        do {
            System.out.println("the value is " + (num * i));
            i++;
        } while (i <= 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of num");
        int num = sc.nextInt();
        doWhile(num);
    }
}
