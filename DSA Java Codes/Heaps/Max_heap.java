import java.util.*;
public class Max_heap {
   public static class MaxHeap{
      ArrayList<Integer> arr = new ArrayList<>();

      public void add(int data){
         // add at last
         arr.add(data);

         int x = arr.size()-1; // child index
         int par = (x-1)/2; // parent index

         while(arr.get(x)>arr.get(par)){
            // swap
            int temp =arr.get(x);
            arr.set(x,arr.get(par));
            arr.set(par,temp);
            x=par;
            par = (x-1)/2;
         }
      }


      public int peek(){

         return arr.get(0);
      }
      public void heaplify(int i){
         int left = i*2+1;
         int right = i*2+2;

         int maxIdx = i;

         if(left <arr.size() && arr.get(maxIdx)<arr.get(left)){
            maxIdx = left;
         }

         if(right <arr.size() && arr.get(maxIdx)<arr.get(right)){
            maxIdx = right;
         }

         if(maxIdx!=i){
            // swap
            int temp = arr.get(i);
            arr.set(i,arr.get(maxIdx));
            arr.set(maxIdx,temp);

            heaplify(maxIdx);
         }

      }

      public int remove(){
         int data = arr.get(0);
         // step1
         //swap
         int temp = arr.get(0);
         arr.set(0,arr.get(arr.size()-1));
         arr.set(arr.size()-1,temp);

         // step2 -> remove last
         arr.remove(arr.size()-1);

         // step3 -. call heaplify
         heaplify(0);

         return data;

      }

      public boolean isEmpty(){
         return arr.size()==0;
      }


   }

   public static void main(String args[]){

      MaxHeap pq = new MaxHeap();
      pq.add(2);
      pq.add(3);
      pq.add(4);
      pq.add(5);
      pq.add(10);
      pq.add(6);
      // pq.remove();

      while(!pq.isEmpty()){
         System.out.println(pq.peek()+" ");
         pq.remove();
         
      }
      
   }
}
