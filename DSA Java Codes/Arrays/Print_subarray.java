public class Print_subarray {
    public static void subArray(int arr[]){
        // print subarray
        int total_subarray=0;
        for(int i=0; i<arr.length; i++){
            int start=i;
            for(int j=i; j<arr.length; j++){
                int end=j;
                for(int k=start; k<=end; k++){
                    System.out.print(arr[k]+" ");
                }
                total_subarray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("The total subarray is "+total_subarray);
    
    }
    public static void main(String args[]){
    
        int arr[]={2,4,6,8,10};
        subArray(arr);
    
    }
}
