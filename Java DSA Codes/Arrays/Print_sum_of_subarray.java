public class Print_sum_of_subarray {
    public static void sum_of_subArray(int arr[]){
        // print sum of subarray
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int sum=0;
                for(int k=i; k<=j; k++){
                    sum +=arr[k];
                }
                System.out.print(sum+" ");
               
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
    
        int arr[]={2,4,6,8,10};
        sum_of_subArray(arr);
    
    
    }
}
