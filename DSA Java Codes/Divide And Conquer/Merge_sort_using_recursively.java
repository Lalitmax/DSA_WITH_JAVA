public class Merge_sort_using_recursively {
    public static void mergeSort(int arr[], int si, int ei){
        // base case
        if(si>=ei){
            return;
        }
        // work
        int mid = si+(ei-si)/2; // Or (si+ei)/2
        mergeSort(arr,si,mid); // Left part
        mergeSort(arr,mid+1,ei); // Right part
        merge(arr,si,mid,ei);   // call for merge array

    }

    public static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1]; // temp array
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
                k++;
            }else{
                temp[k]=arr[j];
                j++;
                k++;
            }
        }

        // left part
        while(i<=mid){
            temp[k]=arr[i];
            i++;
            k++;
        }

        // right part
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        // place into orighinal array
        for(k=0,i=si; k<temp.length; k++,i++){
            arr[i] = temp[k];
        }


        }


        // time complexity 
        //    O(nlogn) 
        // spcae complexity
        //    O(n)
    
    public static void main(String args[]){
    
         int arr[]={4,6,2,7,1};
        mergeSort(arr,0,arr.length-1);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    
    }

}
