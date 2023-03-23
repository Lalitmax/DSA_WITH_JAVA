public class Selection_sort {
    public static void selectionSort(int arr[]){
        // selection sort
        for(int i=0; i<arr.length-1; i++){
            int minimumpos=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minimumpos] > arr[j]){
                    minimumpos = j;
    
                }
            }
            // swap
            int temp = arr[i];
            arr[i]  = arr[minimumpos];
            arr[minimumpos]=temp;
        }
    }

   

    public static void main(String args[]) {

        int arr[] = { 5, 4, 3, 1, 2,7,8,6,4 };
        selectionSort(arr);


         // print array 
         for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
