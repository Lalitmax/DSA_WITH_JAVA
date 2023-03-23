public class Binary_search_in_two_d_array {

    public static boolean staircase(int matrix[][], int key) {
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.print("Key present at cell (" + row + "," + col + ")");
                return true;
            } else if (matrix[row][col] > key) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("Key not found!");
        return false;

    }

    public static void main(String args[]) {

        int matrix[][] = { { 10, 20, 31, 40 },
                { 15, 25, 35, 45 },
                { 20, 30, 40, 50 },
                { 32, 33, 45, 55 } };
        int key = 50;
        staircase(matrix, key);

    }

}
