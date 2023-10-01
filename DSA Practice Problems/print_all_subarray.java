public class print_all_subarray {

   public static void printSubArray(int arr[]) {
      int cnt=0;
      for (int i = 0; i < arr.length; i++) {
         for(int j=i; j<arr.length; j++){

            for(int k=i; k<=j; k++){
               System.out.print(arr[k]);
            }
            System.out.println();
            cnt++;
         }
      }
      System.out.println();
      System.out.println("cout of subarray = "+cnt);

   }

   public static void main(String[] s) {
      int arr[] = { 1, 2, 3, 4 };

      printSubArray(arr);

   }

}
