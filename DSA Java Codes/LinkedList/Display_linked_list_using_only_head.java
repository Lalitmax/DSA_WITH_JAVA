
public class Display_linked_list_using_only_head {

    public static class Node{
        int data;
        Node next; // already null

        public Node(int data){
            this.data=data; // value
            
        }
    }
   
   
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);

        a.next = b;
        b.next=c;
        c.next=d;
        // System.out.println(a.data);
        // System.out.println(a.next.data);
        // System.out.println(a.next.next.data);
        // System.out.println(a.next.next.next.data);


        /// using loop
        Node temp = a;
        for(int i=0; i<4; i++){
            System.out.print(temp.data+" "); // means a.next
            temp = temp.next;

        }
        System.out.println();


        // if you don't provide length of this ll
        temp = a; // again point a then start from head

        for(int i=0; temp!=null; i++){
            System.out.print(temp.data+" "); // means a.next
            temp = temp.next;

        }


        
       
    }
    
}
