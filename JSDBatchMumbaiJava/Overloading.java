
public class Overloading {
    static void calc(int num1, int num2) {
        System.out.println("Addition is : " + (num1 + num2));
        System.out.println("Substraction is : " + (num1 - num2));
        System.out.println("Multiplication is : " + (num1 * num2));
        System.out.println("Division is : " + (num1 / num2));
        System.out.println("-----------------------------");
    }

    static void calc(double num1, double num2) {
        System.out.println("Addition is : " + (num1 + num2));
        System.out.println("Substraction is : " + (num1 - num2));
        System.out.println("Multiplication is : " + (num1 * num2));
        System.out.println("Division is : " + (num1 / num2));
        System.out.println("-----------------------------");
    }

    static void calc(double num1, double num2, double num3) {
        System.out.println("Addition is : " + (num1 + num2+num3));
        System.out.println("Substraction is : " + (num1 - num2 + num3));
        System.out.println("Multiplication is : " + (num1 * num2  * num3));
        System.out.println("Division is : " + (num1 / num2/num3));
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        calc(3.3, 5.5, 7.7);
        calc(6.6, 9.9);
        calc(67, 90);
    }
}
