import java.util.Scanner;

public class whileLoopEg {
    // using while loop
    static void whileLoop(int number) {
        int i = 0;
        while (i <= 10) {
            System.out.println("the value is " + (number * i));
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter The value of num");
        num = sc.nextInt();
        whileLoop(num);
    }
}
