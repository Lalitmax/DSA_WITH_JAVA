public class Add_first_LL {
    public static class Node{
        int data;
        Node next;

        public Node(int data ){
            this.data= data;
        }
    }

    public static class LinkedList{
        Node head =null;
        Node tail = null;

        
        void addFirst(int data){
            Node temp = new Node(data);

            if(head==null){
                head = temp;
                tail = temp;
            }else{
                temp.next = head;
                head = temp;
            }
        }

        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;

            }
        }



    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.display();




        
    }
    
}
