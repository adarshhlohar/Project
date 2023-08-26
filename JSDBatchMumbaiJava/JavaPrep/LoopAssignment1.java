
import java.util.Scanner;

public class LoopAssignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the five number");
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            int temp = i+1;
            System.out.println("Enter the " + temp + " number : ");
            arr[i] = sc.nextInt();
        }

        System.out.println();

        int sum = 0;

        for (int i = 0; i < 5; i++) {
            sum += arr[i];
        }
        System.out.println("The sum all five element is : " + sum);

        double avg = sum / 5;
        System.out.println("The average of all five elemt is : " + avg);

        sc.close();
    }
}
