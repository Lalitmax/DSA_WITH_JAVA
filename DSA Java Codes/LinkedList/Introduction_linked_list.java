import java.util.*;

public class Introduction_linked_list{
    
    public static class Node{
        int data ; // value
        Node next; //  address

        public Node(int data){
            this.data=data;
            this.next = null; // already initialised with null
        }
    }
    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(5);
        Node c = new Node(9);
        Node d = new Node(34);

        a.next = b;
        b.next = c;
        c.next = d;

        System.out.println(a.data); // 4
        System.out.println(a.next.data); // 5

    }

}