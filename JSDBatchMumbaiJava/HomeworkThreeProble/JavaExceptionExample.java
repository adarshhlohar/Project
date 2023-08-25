public class JavaExceptionExample {
    public static void main(String[] args) {
        try {
            int data = 100 / 0;
            System.out.println("this is another line");
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

        // try{
        // String s = null;
        // System.out.println(s.length());
        // }catch(NullPointerException e){
        // System.out.println(e);
        // }

        try {
            int a[] = new int[5];
            a[5] = 30 / 0;
        } catch (Exception e) {
            System.out.println("common task completed");
        }
        System.out.println("rest of the code...");

        System.out.println("rest of code");
    }
}
