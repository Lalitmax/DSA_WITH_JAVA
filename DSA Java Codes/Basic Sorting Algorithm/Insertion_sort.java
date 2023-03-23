public class Insertion_sort {
    public static void insertionSort(int arr[]){
        // insertion sort
        for(int i=1; i<arr.length; i++){

            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1]= temp;
        }
    }


    public static void main(String args[]){
    
        int arr[] = {5,4,1,3,2};
        insertionSort(arr);


        // print array 
        for(int i=0; i<arr.length; i++){
           System.out.print(arr[i]+" ");
       }
    
    
    }
}
