public class Majority_element_with_given_sum {
   public static void main(String[] args) {
      // note all element >=0
      int arr[] = {3,2,3};
      int maxVal = Integer.MIN_VALUE;
      
      // find max value;
      for(int i=0; i<arr.length; i++){
         maxVal=Math.max(maxVal,arr[i]);
      }
      int freq[] = new int[maxVal+1];

      // find frequency
      for(int i=0; i<arr.length; i++){
         freq[arr[i]]++;
      }

      int majorityEle=0;
      // take majority element
      for(int i=0; i<freq.length; i++){
         if(freq[i]>arr.length/2){
            
               majorityEle=i;
            

         }
      }
      System.out.print(majorityEle);

   }
}
