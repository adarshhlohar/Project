import java.util.Scanner;

public class loopsForEg {
    static void calc_Loop(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tha value is " + (number * i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number");
        int number;
        number = sc.nextInt();
        calc_Loop(number);
    }
}
