public class Quick_sort_using_recursively_2_{
    public static void quickSort(int arr[], int si, int ei){

        // base case
        if(si>=ei){
            return;
        }
        // work
        int pIndx = partition(arr, si,ei);
        quickSort(arr, si, pIndx-1);
        quickSort(arr, pIndx+1, ei);
    }

    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i=si-1;

        for(int j=si; j<ei; j++){

            if(arr[j]<=pivot){
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }

        // swap pivot in i position
        i++;
        int temp = pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void main(String args[]){
        
        int arr[] = { 3, 6, 5, 2, 9,10,34,12};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    
    
    }
}