class Floyd_warshall_algorithm {
    public  static void shortest_distance(int[][] matrix) {
        long le9 = 1000000000;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                if (matrix[i][j] == -1) {
                    matrix[i][j] = (int) (le9);
                }

                if (i == j) {
                    matrix[i][j] = 0;
                }

            }
        }

        for (int via = 0; via < matrix.length; via++) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = Math.min(matrix[i][j], matrix[i][via] + matrix[via][j]);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                if (matrix[i][j] == le9) {
                    matrix[i][j] = -1;
                }

            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{0,2,-1,-1},{2,0,3,-1}, {-1,-1,0,-1}, {3,5,4,0}};

        shortest_distance(matrix);

        System.out.println("Shortest distances after calculation:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

}
