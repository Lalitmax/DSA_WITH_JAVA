public class Next_greater_element_brute_force_approach {
   public static void main(String[] args) {
      int arr[] = {6,8,0,1,3};


      for(int i=0; i<arr.length; i++){
         int temp = arr[i];
         boolean greaterOdNot=false;
         for(int j=i+1; j<arr.length; j++){
            if(temp<arr[j]){
               arr[i]=arr[j];
               greaterOdNot=true;
               break;
            }

         }
         if(!greaterOdNot){
            arr[i]=-1;
         }
      }

      for(int i=0; i<arr.length; i++){
         System.out.print(arr[i]+" ");
      }

   }
}
