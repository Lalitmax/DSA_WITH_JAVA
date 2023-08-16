public class Create_and_print_circular_DLL {
   public static class Node {
      int data;
      Node next;
      Node prev;

      public Node(int data) {
         this.data = data;hh
      }

   }

    public static void printCircularLL(Node head){
      Node temp = head;
      System.out.print(head.data+"->");
      head = head.next;

      while(head!=temp){
         System.out.print(head.data+"->");
         head = head.next;
      }
      // System.out.println(head);
   }

   public static void main(String[] args) {
      // 4 10 2 99 14
      Node a = new Node(4);
      Node b = new Node(10);
      Node c = new Node(2);
      Node d = new Node(99);
      Node e = new Node(14);

      a.prev = null;
      a.next = b;
      b.next = c;
      c.next = d;
      d.next = e;
      e.next = a;

      b.prev = a;
      c.prev = b;
      d.prev = c;
      e.prev = d;

      a.prev = e;

      printCircularLL(a);

   }
   
}
