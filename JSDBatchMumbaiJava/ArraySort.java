public class ArraySort {
    public static void main(String[] args) {
        int arr[] = new int[] {76,1,2,78,23,76,12,45,67};
        int temp = 0;

        System.out.println("Printing original array");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("-------------------");


        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                    if(arr[i] > arr[j]){
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
            }
        }

        System.out.println("Printing array in acsending order");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
