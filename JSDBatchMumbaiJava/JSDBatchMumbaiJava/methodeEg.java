import java.util.Scanner;

public class methodeeg {

    static void calcEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("The number is even");
            System.out.println("------------------");
        } else {
            System.out.println("The value is odd");
            System.out.println("----------------");
        }
    }

    static int add(int num1, int num2) {
        return num1 + num2;
    }

    static int sub(int num1, int num2) {
        return num1 - num2;
    }

    static int mul(int num1, int num2) {
        return num1 * num2;
    }

    static float div(int num1, int num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // while (true) {
        // System.out.println("Enter number you want check odd or even");
        // int number = sc.nextInt();
        // calcEvenOdd(number);
        // System.out.println("----*You want to exit the loop press -1*-----");
        // if (number == -1) {
        // break;
        // }

        System.out.println("Enter the number one");
        int number1 = sc.nextInt();

        System.out.println("Enter the number second");
        int number2 = sc.nextInt();

        int result1 = add(number1, number2);
        System.out.println("sum of the numbers :" + result1);

        int result2 = sub(number1, number2);
        System.out.println("Substaction of numbers :" + result2);

        int result3 = mul(number1, number2);
        System.out.println("multiplication of numbers :" + result3);

        float result4 = div(number1, number2);
        System.out.println("Division of number :" + result4);

    }
}
