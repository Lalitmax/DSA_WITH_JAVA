
 public class Intersection_of_LL {
     public static class Node {
         int data;
         Node next;
 
         public Node(int data) {
             this.data = data;
         }
     }
 
     public static Node head = null;
     public static Node tail = null;
 

 
     public static void print(Node head) {
         Node temp = head;
         while (temp != null) {
 
             System.out.print(temp.data + "->");
             temp = temp.next;
         }
         System.out.println(temp);
     }
 
     public static Node getIntersection(Node head1, Node head2) {
 
         while (head1 != null) {
             Node temp = head2;
 
             while (temp != null) {
                 if (head1 == temp) {
                     System.out.println(head1.data);
                     return head1;
                 }
                 temp = temp.next;
             }
 
             head1 = head1.next;
         }
 
         return null;
 
     }
 
     public static void main(String[] args) {

 
         Node a = new Node(1);
         Node b = new Node(2);
         Node c = new Node(3);
         Node d = new Node(6);
         Node e = new Node(7);
 
         a.next = b;
         b.next = c;
         c.next = d;
         d.next = e;
 
         Node a1 = new Node(4);
         Node b1 = new Node(5);
         Node c1 = new Node(6);
         // Node d1 = new Node(7);
 
         a1.next = b1;
         b1.next = c1;
         c1.next = d;
 
         // print(a);
         // print(a1);
         System.out.println(getIntersection(a, a1));
 
     }
 }
