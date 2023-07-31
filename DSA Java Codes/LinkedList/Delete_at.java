import java.util.*;

public class Delete_at {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {
        Node head = null;
        Node tail = null;
        int size = 0;

        void addFirst(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
            size++;
        }

        void addEnd(int data) {
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

        int size() {
            return size;
        }

        void display() {

            Node temp = head;
            while(temp!=null){
                if (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            
            }
            System.out.println();
        }

        void insertAt(int indx, int value){
            Node dupHead=head;
            Node temp = new Node(value);
            if(indx==size()){
                addEnd(value);
                return;
            }else if (indx==0){
                addFirst(value);
                return;
            } else if(indx<0 || indx>size()){
                System.out.println("Wrong Index");
                return;
            }

            for(int i=0; i<indx; i++){
                dupHead = dupHead.next;
            }
           
            temp.next = dupHead.next;
            dupHead.next = temp;
            size++;
           
        }

        void deleteAt(int indx){
            Node temp = head;

            if(indx==0){
                head = head.next;
                size--;
                return;
               
            }

            for(int i=0; i<indx-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;

            if(indx==size()-1){
                tail = temp;
            }
            
        }

        int get(int indx){
            Node temp  = head;
            if(indx<0 || indx>size()){
                System.out.println("Wrong Index");
                return 0;
                
            }

            for(int i=0; i<indx-1; i++){
                temp = temp.next;

            }

            return temp.data;
        }

    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.addEnd(1);
        ll.addEnd(2);
        ll.addEnd(3);
        ll.addEnd(4);
        ll.addEnd(5);
        ll.addFirst(57);
        ll.addEnd(6);
        ll.addEnd(7);
        ll.insertAt(4, 8);
        ll.insertAt(2, 99);
        ll.display();
        // System.out.println(ll.size());
        ll.deleteAt(0);
        ll.display();

        // System.out.println(ll.tail.data);

    }
}

    
