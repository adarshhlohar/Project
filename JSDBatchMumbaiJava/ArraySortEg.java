//Sorting array in ascending/descending order
package activity;

public class ArraySortEg {

	public static void main(String[] args) {
		//initialize array
		int arr[] = new int[] {76,1,2,78,23,76,12,45,67};
		int temp =0;
		
		//printing original array
		for(int a :arr) {
			System.out.print(a + " ");
		}
		
		//sort for ascending
		for(int a=0;a<arr.length;a++) {
			for(int b=a+1;b<arr.length;b++) {
				if(arr[a]>arr[b]) {
					temp = arr[a];
					arr[a] = arr[b];
					arr[b] = temp;
				}
			}
		}
		System.out.println();
		
		//printing sorted array
		for(int res:arr) {
			System.out.print(res + " ");
		}
		System.out.println();
		System.out.println("------------------------------");
		//sort for descending
				for(int a=0;a<arr.length;a++) {
					for(int b=a+1;b<arr.length;b++) {
						if(arr[a]<arr[b]) {
							temp = arr[a];
							arr[a] = arr[b];
							arr[b] = temp;
						}
					}
				}
				System.out.println();
				
				//printing sorted array
				for(int res:arr) {
					System.out.print(res + " ");
				}
	}

}
