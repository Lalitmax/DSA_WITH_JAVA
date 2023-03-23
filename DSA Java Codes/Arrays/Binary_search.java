public class Binary_search {
    public static int binarySearch(int arr[],int key){
        int start=0;
        int end=(arr.length)-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(key==arr[mid]){
                return mid;
            }
            if(key<arr[mid]){
                end=mid-1;
            } else{
                start = mid+1;
            }
        }

        return -1;
    }
    public static void main(String args[]){
    
        int arr[]={9,15,20,25,30,35};
        int key=30;

        int index=binarySearch(arr,key);
        if(index==-1){
            System.out.print("Not found");
        } else{
            System.out.print("key is present at index "+index);
        }

        // Time complexity of BS --> 0(logn)
    
    }
}
