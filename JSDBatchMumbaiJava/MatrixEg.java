
public class MatrixEg {

	public static void main(String[] args) {
		int arr1[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int arr2[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		// resultant matrix 
		int result[][] = new int[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				//addition of two matrix
				result[i][j] = arr1[i][j] + arr2[i][j];
			//	result[i][j] = arr1[i][j] - arr2[i][j];
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
		
System.out.println(" -------------------- ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				result[i][j] =0;
				for(int temp=0;temp<3;temp++) {
					result[i][j] += arr1[i][temp] * arr2[temp][j];
				}
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}

	}

}
