public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {
   
   public static int secondOccure(int[] nums, int t){
      int n = nums.length;
      int s = 0;
      int e  = n-1;
      int mid,ans=-1;

      while(s<=e){
          mid = s+(e-s)/2;
          if(nums[mid]==t){
              ans = mid;
              s= mid+1;

          }else if(nums[mid]<t){
              s=mid+1;
          }else
          {
              e = mid-1;
          }
      }

      return ans;
  }

  public static int firstOccure(int[] nums, int t){
      int n = nums.length;
      int s=0;
      int e=n-1;

      int ans =-1;
      int mid;
      while(s<=e){

          mid = s+(e-s)/2;
          if(nums[mid]==t){
              ans = mid;
              e= mid-1;
          } else if(nums[mid]<t){
              s = mid+1;
          }else
          {
              e = mid-1;
          }

      }

      return ans;

  }

  public static void main(String[] args) {
   int arr[] = {1,2,3,3,4,5,6};
   System.out.println(firstOccure(arr,3));
   System.out.println(secondOccure(arr,3));
  }
   
}
