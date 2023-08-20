import java.util.Stack;

public class Next_greater_element_stack {
   public static void main(String[] args) {
       // next greater code
      int arr[] =  {6,8,0,1,3};;
      Stack<Integer> stack = new Stack<>();

      int nextGreater[] = new int[arr.length];

      for(int i=arr.length-1; i>=0; i--){
         int rightEle = arr[i];

         while(!stack.isEmpty()){

            if(rightEle>=stack.peek()){
               stack.pop();
            }else {
               break;
            }
         }

         // is stack is empty

         if(stack.isEmpty()){
            nextGreater[i]=-1;
         }else{
            nextGreater[i] =stack.peek();
         }

         // push prev element
         stack.push(rightEle);
      }


      for(int i=0; i<nextGreater.length; i++){
         System.out.print(nextGreater[i]+" ");
      }


   }
}
