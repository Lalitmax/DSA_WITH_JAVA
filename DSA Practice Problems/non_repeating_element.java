import java.util.Arrays;
public class non_repeating_element {
   public static void main(String[] args) {
      int arr[] = {4,1,2,1,2};

      Arrays.sort(arr);
      if(arr[0]!=arr[1]){
         System.out.println(arr[0]+" ");
      }
   

      for(int i=1; i<arr.length-1; i++){
         if(arr[i-1]!=arr[i] && arr[i]!=arr[i+1]){
            System.out.println(arr[i]);
         }
         
      }

      if(arr[arr.length-2]!=arr[arr.length-1]){
         System.out.println(arr[arr.length-1]+" ");
      }
     


   }
}
