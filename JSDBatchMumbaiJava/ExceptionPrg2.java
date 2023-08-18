
import java.util.Scanner;

class MyCalculator {
    long power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("p or n one the value is negative");
        }

        if (n == 0 && p == 0) {
            throw new Exception("p and n both values are negative");
        }

        long power = 1;
        int i = 0;

        while (i < p) {
            power *= n;
            i++;
        }
        return power;
    }
}

public class ExceptionPrg2 {

    public static void main(String[] args) {
        MyCalculator mc = new MyCalculator();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n");
        int n = in.nextInt();
        System.out.println("Enter p");
        int p = in.nextInt();

        try {
            System.out.println(mc.power(n, p));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}