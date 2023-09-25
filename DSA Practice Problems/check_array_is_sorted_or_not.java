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
