//fetch second highest & Lowest from array
package activity;

public class ArrayHSEg {

	static int getHighest(int arr[], int len) {
		int temp;
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[len-2]; //second highest
	}
	
	static int getLowest(int arr[], int len) {
		int temp;
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(arr[i]<arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[len-2]; //second lowest
	}
	public static void main(String[] args) {	
		int arr[]= {33,44,56,23,67,88,91,45,89};
		System.out.println("Second Highest : " + getHighest(arr, 9));
		System.out.println("Second Lowest : " + getLowest(arr, 9));
	}

}
