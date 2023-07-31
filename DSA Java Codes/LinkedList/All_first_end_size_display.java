public class All_first_end_size_display {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }

    public static class LinkedList{
        Node head=null;
        Node tail =null;

        void addEnd(int data){
            Node temp = new Node(data);

            if(head==null){
                head = temp;
            }else{
                tail.next = temp;
            }
            tail = temp;
        }

        void addFirst(int data){
            Node temp = new Node(data);
            if(head==null){
                head = temp;
                tail = temp;

            }else{
                temp.next = head;
                tail = temp;

            }
            
        }

      

        void display(){
            
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp= temp.next;
            }
            System.out.println();

        }


         int  size(){
            int cnt=0;
            Node temp = head;
            while(temp!=null){
                cnt++;
                temp= temp.next;
            }
            return cnt;

        }
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addEnd(1);
        ll.addEnd(2);
        ll.addEnd(3);
        ll.addEnd(4);

        ll.display();
        System.out.print(ll.size());
        

        
    }
}
