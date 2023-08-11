import java.util.Scanner;

public class StarPattern {

    static void StarXPattern(int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < ((row - i) * 2) - 1; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = 2; i <= row; i++) {
            for (int j = i; j <= row; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < (i * 2 - 1); j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row;
        System.out.println("Enter Row you want");
        row = sc.nextInt();
        StarXPattern(row);
    }
}
