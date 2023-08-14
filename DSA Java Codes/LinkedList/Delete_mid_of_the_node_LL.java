
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

  public static class LinkedList {
    Node head = null;
    Node tail = null;

    void addLast(int value) {
      Node temp = new Node(value);

      if (head == null) {
        head = tail = temp;
      } else {
        tail.next = temp;
        tail = temp;
      }
    }

    void print() {
      Node temp = head;
      while (temp != null) {
        System.out.print(temp.data + "->");
        temp = temp.next;
      }
      System.out.println("null");
    }

    void deleteNodes(int m, int n) {
      Node temp = head;
      // code
      while(temp!=null){

        for(int i=0; i<m-1 && temp!=null; i++){
          temp = temp.next;
        }

        if(temp==null){
          return;
        }
        Node toDelete = temp;

        for(int j=0; j<n && toDelete!=null; j++){
          toDelete=toDelete.next;
        }
        temp.next=toDelete;
      }

      }
  }

  public static void main(String[] args) {
    LinkedList ll1 = new LinkedList();

    ll1.addLast(1);
    ll1.addLast(2);
    ll1.addLast(3);
    ll1.addLast(4);
    ll1.addLast(5);
    ll1.addLast(6);
    ll1.addLast(7);
    ll1.addLast(8);
    ll1.addLast(9);
    ll1.addLast(10);

    System.out.print("Original Linked List: ");
    ll1.print();

    int m = 3;
    int n = 2;
    ll1.deleteNodes(m, n);

    System.out.print("Modified Linked List: ");
    ll1.print();
  }
}
