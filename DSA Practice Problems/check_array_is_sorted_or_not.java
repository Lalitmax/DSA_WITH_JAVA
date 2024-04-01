public class check_array_is_sorted_or_not {

   public static boolean isSorted(int arr[], int i){
      if(i==arr.length-1){
         return true;
      }
      if(arr[i]>arr[i+1]){
         return false;

      }

     boolean s= isSorted(arr,i+1);
     System.out.print("true ");
     return s;
   }
   public static void main(String s[]){
      int arr[] = {1,2,3,4,5};

      System.out.print(isSorted(arr,0));

   }
}



class Solution {
   public int minimumSubarrayLength(int[] nums, int k) {
       int left = 0;
       int minLength = Integer.MAX_VALUE;
       int currentOr = 0;
       
       for (int right = 0; right < nums.length; right++) {
           currentOr |= nums[right];
           
           while (currentOr >= k) {
               minLength = Math.min(minLength, right - left + 1);
               currentOr &= ~nums[left++];
           }
       }
       
       return minLength == Integer.MAX_VALUE ? -1 : minLength;
   }
}
