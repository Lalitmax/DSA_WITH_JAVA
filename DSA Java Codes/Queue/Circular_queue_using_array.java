public class Circular_queue_using_array {
   public static class Queue{
      static int arr[];
      static int size;
      static int rear;
      static int front;

      public Queue(int n){
         arr = new int[n];
         size=n;
         rear=-1;
         front =-1;
      }

      // isempty

      public static boolean isEmpty(){
         return rear ==-1 && front ==-1;

      }

      // isFull
      public static boolean isFull(){
         return front == (rear+1)%size;
      }

      // add
      public static void add(int data){
         if(isFull()){
            System.out.println("Queue is full");
            return;
         }

         if(front==-1){
            front=0;
         }
         rear = (rear+1)%size;

         arr[rear]=data;
      }


      // remove
      public static int remove(){
         if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
         }

         int result = arr[front];

         front = (front+1)%size;
         return result;

      }

      public static int peek(){
         if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
         }
         return arr[front];
      }

      public static void print(){
         for(int i=0 ; i<size; i++){
            System.out.print(arr[i]+" ");
         }
         System.out.println();
      }
   }
   public static void main(String[] args) {
      Queue q = new Queue(5);
      q.add(1);
      q.add(2);
      q.add(3);
      q.add(4);
      q.add(5);
      q.remove();
      q.add(1);
   

      System.out.println(q.peek());
      System.out.println(q.remove());
      
      
   }
}
