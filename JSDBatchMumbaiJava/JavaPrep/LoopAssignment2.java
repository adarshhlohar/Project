import java.util.Scanner;

public class LoopAssignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the five number");
        int arr[] = new int[10];
        for (int i = 0; i < 10; i++) {
            int temp = i+1;
            System.out.println("Enter the " + temp + " number : ");
            arr[i] = sc.nextInt();
        }
        int small = arr[0];
        int large = arr[0];

        for(int elem : arr){
            if (small > elem) {
                small = elem;
            }
            if (large < elem) {
                large = elem;
            }
        }

        System.out.println("The smallest element in arr is : " + small);
        System.out.println("The largest element in arr is : " + large);
        sc.close();;
    }
}
