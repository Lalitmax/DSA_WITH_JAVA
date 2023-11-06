public class find_number_of_subArray_where_sum_is_greater_than_given_sum {
   public static void main(String srg[]){
      int arr[] = {2,3,0,-4,6,-9,-4,3};

      int key = 4;
      int preFix[] = new int[arr.length];

      preFix[0] = arr[0];
      for(int i=1; i<arr.length; i++){
         preFix[i] = preFix[i-1] +arr[i];
      }


      int total=0;

      for(int i=0; i<arr.length; i++){
         int cnt =0;
         int subSum = preFix[i]-key;

         for(int j=0; j<i; j++){
            if(subSum>=preFix[j]){
               cnt++;
            }

         }
         total +=cnt;
      }
      System.out.println();
      System.out.print(total);
   }
}
