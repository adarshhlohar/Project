//Remove duplicate elements from array


import java.util.Arrays;

public class DuplicateArrayEg {
	
	//static method to calculate duplication
	static int removeElement(int arr[], int n) {
		if(n==0 || n==1) {
			return n;
		}
		int temp[]= new int[n];
		int j =0;
		for(int i=0;i<n-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n-1];
		
		//change original array 
		for(int i=0;i<j;i++) {
			arr[i]=temp[i];
		}
		return j;
	}

	public static void main(String[] args) {
		int arr[]= {10,56,78,1,3,5,7,7,8,9,9,9,67,78}; //array initialize
		
		Arrays.sort(arr); //sorting array
		
		int len = arr.length; //array length

		System.out.println("printing original array\n");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		len = removeElement(arr, len); //invoke method
		
		//print array
		for(int i=0;i<len;i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
