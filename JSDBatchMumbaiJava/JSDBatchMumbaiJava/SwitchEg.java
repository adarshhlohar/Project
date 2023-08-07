import java.util.Scanner;

public class SwitchEg {
    static void calc_passfail(int marks){
        switch (marks/10) {
            case 9:
                System.out.println("Youre are marks are above 90 or less than 100");
                break;
            case 8:
                System.out.println("Youre are marks are above 80 or less than 90");
                break;
            case 7:
                System.out.println("Youre are marks are above 70 or less than 80");
                break;
            case 6:
                System.out.println("Youre are marks are above 60 or less than 70");
                break;
            case 5:
                System.out.println("Youre are marks are above 50 or less than 60");
                break;
            case 4:
                System.out.println("Youre are marks are above 40 or less than 50");
                break;
            default:
                System.out.println("Youre fail because youre marks is less than 40 OR youre Absent OR youre entered wrong marks");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Youre marks");
        int marks = sc.nextInt();
        calc_passfail(marks);
    }
}
