import java.util.ArrayList;

public class Remove_from_Heap {
   static class Heap{
      ArrayList<Integer> arr = new ArrayList<>();

      public void add(int data){
         // add at last
         arr.add(data);

         int x = arr.size()-1; // child index
         int par = (x-1)/2; // parent index

         while(arr.get(x)<arr.get(par)){
            // swap
            int temp =arr.get(x);
            arr.set(x,arr.get(par));
            arr.set(par,temp);
         }
      }

      public int peek(){
         return arr.get(0);
      }

      private void Heapify(int i){
         int left = 2*i+1;
         int right = 2*i+2;

         int minIdx = i;

         if(left< arr.size() && arr.get(minIdx)>arr.get(left)){
            minIdx = left;

         }

         if(right < arr.size() && arr.get(minIdx)> arr.get(right)){
            minIdx = right;
         }

         if(minIdx!=i){
            //swap
            int temp = arr.get(i);
            arr.set(i,arr.get(minIdx));
            arr.set(minIdx,temp);

             Heapify(minIdx);
         }

        

      }

      public int remove(){
         int data = arr.get(0);

         //step1 - swap - 1st and last
         int temp = arr.get(0);
         arr.set(0,arr.get(arr.size()-1));
         arr.set(arr.size()-1,temp);

         // step2
         arr.remove(arr.size()-1);

         //step3 Heapify
         Heapify(0);

         return data;


      }

      public boolean isEmpty(){
         return arr.size()==0;
      }

   }
    public static void main(String args[]){

      Heap pq = new Heap();
      pq.add(2);
      pq.add(3);
      pq.add(4);
      pq.add(5);
      pq.add(10);
      pq.add(6);
      pq.remove();

      while(!pq.isEmpty()){
         System.out.println(pq.peek()+" ");
         pq.remove();
         
      }
      
   }
}
