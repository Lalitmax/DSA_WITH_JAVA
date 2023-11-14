
public class Flatten_a_multilevel_DLL {

   static class  Node {
      public int data;
      public Node prev;
      public Node next;
      public Node child;

      public Node(int data) {
         this.data = data;
         this.prev = null;
         this.next = null;
         this.child = null;
      }
   }

   public Node flatten(Node head) {
      Node temp = head;
      while (temp != null) {
         Node t = temp.next;
         if (temp.child != null) {
            Node c = flatten(temp.child);
            temp.next = c;
            c.prev = temp;

            while (c.next != null) {
               c = c.next;
            }

            c.next = t;
            if (t != null) {
               t.prev = c;
            }

            temp.child = null;
         }
         temp = t;
      }

      return head;
   }

   public static void main(String[] args) {
      // Example usage
      Node head = new Node(1);
      head.next = new Node(2);
      head.next.prev = head;
      head.next.next = new Node(3);
      head.next.next.prev = head.next;
      head.next.next.next = new Node(4);
      head.next.next.next.prev = head.next.next;
      head.next.next.next.child = new Node(5);
      head.next.next.next.child.next = new Node(6);
      head.next.next.next.child.next.prev = head.next.next.next.child;

      Flatten_a_multilevel_DLL flattenDLL = new Flatten_a_multilevel_DLL();
      Node flattenedHead = flattenDLL.flatten(head);

      // Print the flattened list for verification
      while (flattenedHead != null) {
         System.out.print(flattenedHead.data + " ");
         flattenedHead = flattenedHead.next;
      }
   }
}
