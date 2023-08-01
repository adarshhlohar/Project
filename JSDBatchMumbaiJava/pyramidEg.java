public class pyramidEg {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" $ ");
            }
            System.out.println();
        }

        System.out.println("--------------------------");

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }

        // using while loop
        int i= 1;
        while (i <= 10) {
            if (i == 5) {
                i++;
                continue;
            }
            System.out.println(" " + 5*i + " ");
            i++;
        }
    }
}
