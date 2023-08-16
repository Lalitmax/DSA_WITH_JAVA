
public class Remove_head_in_CDLL {
   public static class Node {
      int data;
      Node next;
      Node prev;

      public Node(int data) {
         this.data = data;
      }

   }

 


   public static void print(Node head) {
      Node temp = head;
      while (temp != null) {
         System.out.print(temp.data + "->");
         temp = temp.next;

      }
      System.out.println(temp);
   }

   public static void printCircularLL(Node head) {

      Node temp = head;
      System.out.print(head.data + "->");
      head = head.next;

      while (head != temp) {
         System.out.print(head.data + "->");
         head = head.next;
      }
      System.out.println(head);
   }

   public static boolean isCircular(Node head) {
      Node slow = head;
      Node fast = head;

      while (fast != null && fast.next != null) {
         slow = slow.next;
         fast = fast.next.next;
         if (slow == fast) {
            return true;
         }
      }
      return false;

   }

   public static Node removeHead(Node head) {
      Node last = head.prev;
      Node newNode = head.next;
      last.next = newNode;
      newNode.prev = last;
      return newNode; // Return the new head node

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
      a = removeHead(a);
      printCircularLL(a);
      // print(a);
      System.out.println(isCircular(a));

   }

}
