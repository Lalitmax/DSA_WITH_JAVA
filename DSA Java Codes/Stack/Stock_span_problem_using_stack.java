import java.util.Stack;

public class Stock_span_problem_using_stack {

   public static int[] stockSpan(int arr[]){
      
      Stack<Integer> stack = new Stack<>();

      int span[] = new int[arr.length];

      for(int i=0; i<arr.length; i++){

         int currPrice = arr[i];
         while(!stack.isEmpty()){
            if(currPrice>=arr[stack.peek()]){
               stack.pop();
            }else {
               break;
            }
         }

         if(stack.isEmpty()){
            span[i]=i+1;
         }else {
            span[i]=i-stack.peek();
         }

         stack.push(i);
      }

      return span;
   }
   public static void main(String[] args) {

        // next greater code
        int arr[] = {100,80,60,70,60,85,100};

        int span[] = new int[arr.length];
        span = stockSpan(arr);
      

      
      for(int i=0; i<span.length; i++){
         System.out.print(span[i]+" ");
      }
      
   }
}
