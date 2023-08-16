package myProgram;

public class tryCatchEg {

	public static void main(String[] args) {
		try {
			int arr[] = {1,7,4,6,8,3,8,32};
			for(int a : arr) {
				System.out.print(a + " ");
//			System.out.println(arr[14]);   produce an error 
			}
			try {
				int x  = arr[6]/0;
				System.out.println(x);
			}catch(ArithmeticException e) {
				System.out.println(e);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}

	}

}
