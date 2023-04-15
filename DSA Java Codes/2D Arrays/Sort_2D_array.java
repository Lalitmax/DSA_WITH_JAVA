public class Sort_2D_array {
    

    
    public static void sort2d(int arr2[][]){
        int n = arr2.length;
        int m = arr2[0].length;
        // System.out.println(n+"\n"+m);

        for(int i=0; i<n; i++){
            for(int k=0; k<m; k++){
                for(int j=0; j<m-k-1; j++){
                    if(arr2[i][j]>arr2[i][j+1]){
                        int temp = arr2[i][j];
                        arr2[i][j]=arr2[i][j+1];
                        arr2[i][j+1]=temp;
                    }
                }
            }
        }

    }
    public static void main(String args[]){
        
        int arr2[][]={{10,13,12,11,14},{20,24,21,23,25},{30,34,32,33,31}};

          sort2d(arr2);
          int n = arr2.length;
            int m = arr2[0].length;
          for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr2[i][j]+" ");
               
            }
            System.out.println();
        }
    }
}

