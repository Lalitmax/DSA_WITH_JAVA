public class first_occurence_and_last_occurence {

   
   public static void main(String s[]){
      int arr[]={ 1, 3, 5, 5, 5, 5, 67, 123, 125 };
      int key = 3;

      int first_index=0;
      int second_index=0;

      int start=0;
      int end = arr.length-1;
      while(start<=end){
         int mid = (start+end)/2;

         if(arr[mid]==key){
           if(arr[mid-1]<arr[mid]){
             first_index= mid;
            break;
           }
         } 
         if(arr[mid]<key){
            start=mid+1;
         }else{
            end = mid-1;
         }

      }
         start=0;
         end = arr.length-1;

      while(start<=end){
         int mid = (start+end)/2;

         if(arr[mid]==key){
           if(arr[mid]<arr[mid+1]){
             second_index= mid;
            break;
           }
         } 
         if(arr[mid]>key){
            end = mid-1;
         }else{
            start=mid+1;
         }

      }

      System.out.print(first_index);
      System.out.print(second_index);

   }
}
