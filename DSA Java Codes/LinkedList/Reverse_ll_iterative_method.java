
public class Reverse_ll_iterative_method {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    static Node head = null;
    static Node tail = null;

    public static class LinkedList {
        int size = 0;

        void addLast(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        int removeFirst() {
            int v = head.data;
            head = head.next;
            size--;
            return v;

            

        }

        int size() {
            return size;
        }

        void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        void reverse() {
            
            Node curr = tail= head;
            Node pre = null;
            Node temp = null;
            while(curr!=null){
                
                temp  = curr.next;
                
                curr.next = pre;
                pre = curr;
                curr = temp;
                
            }
            head =pre; 
     
            
        }

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

         ll.print();
        ll.reverse();
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(5);
        
        ll.print();
        

    }

}