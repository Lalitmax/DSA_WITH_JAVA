public class  find_pivot_in_array{

   public static void main(String d[]){
      int arr[] = {4,5,6,7,1,2,3};

      int start = 0;

      int end = arr.length-1;

            while(start<end){
         int mid = (start+end)/2;
         if(arr[0]<=arr[mid]){
            start = mid+1;

         }else{
            end = mid;
         }
         

      }

      System.out.println(start);

   }
}