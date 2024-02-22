import java.security.PublicKey;

public class doubly_ll_practice {

    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }
    }

    public static class DoublyLinkedList {
        static Node head = null;
        static Node tail = null;

        static int size=0;

        public void addLast(int data) {

            Node newNode = new Node(data);

            if (head == null) {

                head = newNode;
                tail = newNode;

            } else {
                newNode.prev = tail;
                tail.next = newNode;
                tail = newNode;

            }
            size++;
        }

        public void addFirst(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                head.prev = newNode;
                newNode.next = head;
                head = newNode;
            }
            size++;

        }

        public void addAt(int index, int data){
            Node newNode = new Node(data);

            if(size<index){
                System.out.println("Out of bound ");
                return;
            }else{

                Node temp  = head;

                for(int i=0; i<index-1; i++){
                    temp = temp.next;

                    
                }

                Node nextNode = temp.next;
                newNode.prev = temp;
                temp.next = newNode;

                temp = newNode;
                if (nextNode != null) {
                    nextNode.prev = newNode;
                    newNode.next = nextNode;
                }



            }

            


        }

        public void displayAllByHead() {

            Node temp = head;

            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }

        }

        static void displayAllByTail() {
            Node temp = tail;

            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.prev;

            }

        }
    }

    public static void addAt(int index, int data) {

    }

    public static void main(String[] args) {

        DoublyLinkedList dLL = new DoublyLinkedList();

        dLL.addLast(0);
        dLL.addLast(1);
        dLL.addLast(2);
        dLL.addLast(3);
        dLL.addLast(4);
        dLL.addFirst(-1);
        dLL.addFirst(-2);
        dLL.addLast(5);
        dLL.addAt(2, 3);
        // dLL.displayAllByHead();
        dLL.displayAllByTail();

    }
}
