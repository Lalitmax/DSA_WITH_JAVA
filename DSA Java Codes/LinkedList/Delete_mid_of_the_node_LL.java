
public class Delete_mid_of_the_node_LL {
  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
    }
  }

  public static Node head = null;
  public static Node tail = null;
  public static int size = 0;

  public static class LinkedList {

    public void addFirst(int value) {
      Node temp = new Node(value);
      size++;
      if (head == null) {
        head = tail = temp;

      } else {
        temp.next = head;
        head = temp;

      }

    }

    public void print( Node head) {
      Node temp = head;
      while (temp != null) {
        System.out.print(temp.data + "->");
        temp = temp.next;
      }
      System.out.print(temp);
      System.out.println();

    }

    public Node  deleteMid(){

      if(head ==null || head.next==null){
        return null;
      }
      Node slow = head;
      Node fast = head;
      Node prev = null;

      while( fast!=null && fast.next!=null){
        prev = slow;
        slow  = slow.next;
        fast=fast.next.next;
      }

      if(prev!=null){
        prev.next = slow.next;
      }

      return head;

    }

  }

  public static void main(String[] args) {
    LinkedList ll = new LinkedList();

    ll.addFirst(5);
    ll.addFirst(4);
    ll.addFirst(3);
    ll.addFirst(2);
    ll.addFirst(1);
    ll.print(head);
    head = ll.deleteMid();
    ll.print(head);

  }
}
