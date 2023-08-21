import java.util.*;
public class Maximum_Rectangular_Area_in_Histogram_using_stack {

   public static int[] nextSmallLeft(int arr[]){
      Stack<Integer> s = new Stack<>();

      int nsl[] = new int[arr.length];

      for(int i=0; i<arr.length; i++){

         int currEle = arr[i];

         while(!s.isEmpty() && arr[s.peek()]>=currEle){
            s.pop();
         }


         if(s.isEmpty()){
            nsl[i] = -1;
         }else {
            nsl[i]=s.peek();
         }
         s.push(i);
      }

      return nsl;
   }

   public static int[] nextSmallRight(int arr[]){
      Stack<Integer> s = new Stack<>();

      int nsr[] = new int[arr.length];

      for(int i=arr.length-1; i>=0; i--){

         int currEle = arr[i];

         while(!s.isEmpty()){
            if(arr[s.peek()]>=currEle){
               s.pop();
            }else {
               break;
            }
         }

         if(s.isEmpty()){
            nsr[i]=arr.length;
         }else {
            nsr[i]=s.peek();
         }

         s.push(i);
      }

      return nsr;
   }

   public static void maxAreaRec(int arr[]){   // O(n)

      int nsl[] = nextSmallLeft(arr);  // next smaller left  O(n)
      int nsr[] = nextSmallRight(arr); // next smaller right O(n)
      int maxArea=0;

      for(int i=0; i<arr.length; i++){
         int height = arr[i];
         int width = nsr[i]-nsl[i]-1;

         int area = height*width;

         maxArea = Math.max(area,maxArea);
      }

      System.out.print(maxArea);
   }
   public static void main(String[] args) {
      int arr[]={2,1,5,6,2,3};
      maxAreaRec(arr);
   }
}
