public class Queue_using_LinkedList {
   public static class Node {
      int data;
      Node next;

      public Node(int data) {
         this.data = data;
         this.next = null;
      }
   }

   // public static Node head = null;
   // public static Node tail = null;

   public static class Queue {
      static Node head = null;
      static Node tail = null;

      // isEmpty
      public static boolean isEmpty() {
         if (head == null) {
            return true;
         }
         return false;
      }

      // add

      public static void add(int data) {
         Node newNode = new Node(data);

         if (head == null) {
            head = tail = newNode;
         } else {
            tail.next = newNode;
            tail = newNode;
         }
      }

      // remove
      public static int remove() {
         if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
         }

          int front = head.data;
         if(tail==head){
            head=tail = null;
         }else{
            head = head.next;
         }
         
         
        

         return front;

      }

      public static int peek() {
         if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
         }
         return head.data;

      }

      

   }

   public static void main(String[] args) {

      Queue q = new Queue();

      q.add(1);
      q.add(2);
      q.add(3);
      q.add(4);
      q.add(5);

      q.remove();
 
      while(!q.isEmpty()){
         System.out.print(q.peek()+ " ");
         q.remove();
      }

   }
}
