import java.util.Scanner;

public class pallindromeUsingWhile {
    static void reverse(int number) {
        int originalNum = number;
        int reverse = 0;
        int temp = 0;

        while (number != 0) {
            temp = number % 10;
            reverse = reverse * 10 + temp;
            number = number / 10;
        }

        if (reverse == originalNum) {
            System.out.println("The value you have entered this is pallindrome");
        } else {
            System.out.println("The value you have entered this is not pallindrome");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number you want check Pallindrom Or Not");
        int num = sc.nextInt();
        reverse(num);
    }
}
