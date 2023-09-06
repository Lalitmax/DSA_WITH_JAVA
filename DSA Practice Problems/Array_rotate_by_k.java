public class Array_rotate_by_k {
   public static void rotate(int[] nums, int k) {
      int len = nums.length;
      int temp[]  = new int[len];
    
      for(int i=0; i<len; i++){
          temp[(i+k)%len]=nums[i];
      }

      // copy temp into nums

     
      System.arraycopy(temp, 0, nums, 0, len);
      
      
  }

  public static void main(String[] args) {
   int nums[]={1,2,3,4,5,6,7};
   rotate(nums,2);
   for(int i=0; i<nums.length; i++){

      System.out.print(nums[i]+" ");
   }
  }
}
