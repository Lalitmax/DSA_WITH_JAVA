public class Display_ll_function_and_recursively {
    
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }

    public static void displayRec(Node head){
        if(head==null){
            return;
        }
        displayRec(head.next);
        System.out.print(head.data+" ");
        
    }
    public static void display(Node haed){
        Node temp = haed;
        for(int i=0; temp!=null; i++){
            System.out.print(temp.data+" ");
            temp = temp.next;
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
        displayRec(a);
       

        
    }
}
