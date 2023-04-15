public class Spiral_print_in_2D_array {
    public static void spiralPrint(int arr2[][]){
        int startRow=0;
        int startCol=0;
        int endRow = arr2.length-1;
        int endCol = arr2[0].length-1;

        while(startRow<=endRow && startCol<=endCol){
            // top print
            for(int i=startCol; i<=endCol; i++){
                System.out.print(arr2[startRow][i]+" ");
            }
            
            // right print
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(arr2[i][endCol]+" ");
            }

            // bottom print
            for(int i=endCol-1; i>=startCol; i--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(arr2[endRow][i]+" ");
            }

            // left
            for(int i=endRow-1; i>=startRow+1; i--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(arr2[i][startCol]+" ");

            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }
    public static void main(String args[]){
        int arr2[][]={{1,2,3,4}
                    ,{5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};
        spiralPrint(arr2);
    }
    
}
