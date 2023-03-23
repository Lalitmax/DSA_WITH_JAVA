import java.util.*;

public class Lenear_search_in_two_array {
    public static void printMatrix(int matrix[][]){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (key == matrix[i][j]) {
                    System.out.println("Found at cell (" + i + "," + j + ")");
                    return;
                }
            }
            
        }
        System.out.println("Not found");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix ");

        int matrix[][] = new int[3][3];
        // input
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter key : ");
        int key = sc.nextInt();
        printMatrix(matrix);
        search(matrix, key);

    }

}