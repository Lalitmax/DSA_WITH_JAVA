public class Insert_node_at_ny_given_index {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }

    public static class LinkedList{
        Node head =null;
        Node tail =null;

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

        

        void addEnd(int data){
            Node temp = new Node(data);

            if(head==null){
                head = temp;
            }else{
                tail.next = temp;
            }
            tail = temp;
        }

       

        void insert(int indx, int value){
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

            for(int i=0; i<indx-1; i++){
                dupHead = dupHead.next;
            }
           
            temp.next = dupHead.next;
            dupHead.next = temp;
           
        }

        int size(){
            int cnt=0;
            Node temp = head;
            while(temp!=null){
                cnt++;
                temp= temp.next;
            }
          return cnt;

        }
        void display(){
            
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp= temp.next;
            }
            System.out.println();

        }

    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addEnd(1);
        ll.addEnd(2);
        ll.addEnd(3);
        ll.addEnd(4);
        ll.addEnd(5);
        ll.insert(5,8);
        ll.insert(96,99);
        ll.display();
        System.out.println(ll.tail.data);
        
    }
}
