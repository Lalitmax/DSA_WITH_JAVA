public class Sum_of_alternating_sign_in_array {
    public static int alternatingSum(int arr[]){

        int plus_sum=0,minus_sum=0;
        for(int i=0,j=1; i<arr.length; i +=2, j +=2){
            plus_sum +=arr[i];
            if(j<arr.length){
                minus_sum +=arr[j];
            }
        }
        int ans =plus_sum- minus_sum;
        return ans;
    }
    public static void main(String args[]){
    
        int arr[] = {5,3,8,4};
        int ans = alternatingSum(arr);
        System.out.print(ans);
    
    
    }
}
