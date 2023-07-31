import java.util.*;
public class Add_last_in_LL {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
        }
    }
    public static class LinkedList{
        Node head = null;
        Node tail = null;

        void addEnd(int data){
            Node temp = new Node(data);
           if(head==null){
             head = temp;

           }else{

            tail.next=temp;
           }
            tail = temp;

        }
       
        void display(){
             Node newhead=head;
            while(newhead!=null){
                System.out.print(newhead.data+" ");
                    newhead = newhead.next; 
            }
             System.out.println();
        }
        
        int size(){
            Node sizeHead=head;
            int cnt=0;
            while(sizeHead!=null){
                cnt++;
                    sizeHead = sizeHead.next; 
            }
            return cnt;
        }

    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addEnd(5);
        ll.addEnd(6);
        ll.addEnd(7);
        ll.addEnd(8);
        ll.addEnd(9);
        ll.display();
       
        System.out.println(ll.tail.next);
        
    }
}
