public class NestedLoopEg {
    public static void main(String[] args) {
        // loop outer
        for (int i = 1; i <= 4; i++) {
            // inner loop
            for (int j = 1; j <= 4; j++) {
                System.out.println("The value i is " + i + " The value of j is " + j);
            }   //end inner
        }   //end outer
    }
}
