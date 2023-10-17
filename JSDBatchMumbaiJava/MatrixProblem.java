package HomeworkThreeProble;

import java.util.Scanner;

public class MatrixProblem {

    static public void display(){
        Scanner sc = new Scanner(System.in);
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("The old matrix is : ");
        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int n = matrix[i][j];
                int count = 0;
                for (int k = 1; k <= n; k++) {
                    if (n % k == 0) {
                        count++;
                    }
                }

                if(count > 2){
                    matrix[i][j] = 0;
                }

            }
        }

        System.out.println("The new Matrix is  : ");
        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        MatrixProblem obj = new MatrixProblem();
        obj.display();
    }
}
