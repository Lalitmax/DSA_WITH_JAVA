public class Quick_sort {
    public static void QuickSort(int arr[], int si, int ei){
        // base case 
        if(si>=ei){
            return;
        }
        // work
        int pivot = arr[ei]; // last index

        int pindx = partion(arr,si,ei, pivot);

        QuickSort(arr,si,pindx-1); // left part
        QuickSort(arr,pindx+1, ei); // right part
        
    }
    public static int partion(int arr[], int si, int ei, int pivot){
        int i=si-1;
        for(int j=si; j<ei; j++){
        if(arr[j]<=pivot){
            i++;
            // awap
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i]= temp;

        }

        
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;

    }
    public static void main(String args[]){
    
        int arr[] = {4,6,2,9,1};
        QuickSort(arr, 0, arr.length-1);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    
    
    }
    
}
