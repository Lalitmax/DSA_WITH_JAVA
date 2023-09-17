public class Squares_of_array {
   public static void main(String[] args) {
      int arr[] = {-4,-1,0,3,10};

      int n=arr.length;
      int newArr[] = new int[n];

      int i=0;
      int j=n-1;

      for(int k=n-1; k>=0; k--){
         int sqr1 = arr[i]*arr[i];
         int sqr2 = arr[j]*arr[j];

         if(sqr1<sqr2){
            newArr[k]=sqr2;
            j--;
           

         }else{
             newArr[k]=sqr1;
             i++;
         }
      }

      for(int k=0; k<n; k++){
         System.out.print(newArr[k]+" ");
      }
   }
}
