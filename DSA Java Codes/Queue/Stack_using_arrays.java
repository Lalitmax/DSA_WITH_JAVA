public class Stack_using_arrays {
   public static class Queue {
      static int arr[];
      static int size;
      static int rear;

      public Queue(int n) {
         arr = new int[n];
         size = n;
         rear = -1;
      }

      // isEmpty

      public static boolean isEmpty() {
         return rear == -1;
      }

      // Add

      public static void Add(int data) {
         if (rear == size - 1) {
            System.out.println("Queue is full");
            return;
         }

         rear++;
         arr[rear] = data;

      }

      // remove
      public static int remove() {
         if (isEmpty()) {
            System.out.println("Queue is isEmpty");
            return -1;
         }
         int front = arr[0];
         for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
         }
         rear--;

         return front;
      }

      // peek

      public static int peek() {
         if (isEmpty()) {
            System.out.println("Queue is isEmpty");
            return -1;
         }

         return arr[0];
      }

      public static void print(){
         for(int i=0; i<=rear; i++){
            System.out.print(arr[i]+" ");
         }
         System.out.println();
      }
   }


   public static void main(String[] args) {

      Queue q = new Queue(5);

      q.Add(1);
      q.Add(2);
      q.Add(4);
      
      while(!q.isEmpty()){
         System.out.print(q.peek()+" ");
         q.remove();
      }


   }
}