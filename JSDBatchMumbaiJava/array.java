public class array {
    public static void main(String[] args) {
        int arr[] = new int[6];
        arr[0] = 30;
        arr[1] = 31;
        arr[2] = 32;
        arr[3] = 33;
        arr[4] = 34;
        arr[5] = 35;
        System.out.println(arr[5]);

        for (int i = 0; i < 6; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int numbers[] =  {2,4,6,4,4,6,3,45,6,8,66,45,49};
        System.out.println("-------------------");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println(numbers.length);
    }
}
