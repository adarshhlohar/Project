public class pyramidUsingLoop {
    public static void main(String[] args) {
        // loop outer
        for (int i = 1; i <= 4; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            } // end inner
            System.out.println();
        } // end outer

        for (int i = 1; i <= 5; i++) {
            // inner loop
            for (int j = i; j <= 5; j++) {
                System.out.print(" * ");
            } // end inner
            System.out.println();
        } // end outer
    }
}
