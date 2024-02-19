import java.security.PublicKey;

public class doubly_ll_practice {

    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
        }
    }
    
    public static class DoublyLinkedList{
       static Node head = null;
       static Node tail = null;

        static void addLast(int data){

            Node newNode = new Node(data);

            if(head==null){

                head = newNode;
                tail = newNode;

            }else{
                newNode.prev = tail;
                tail.next = newNode;
                tail = newNode;

            }
        }

        static void displayAllByHead(){

            Node temp = head;

            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }

        }


        static void displayAllByTail(){
            Node temp = tail;

            while (temp!=null) {
                System.out.print(temp.data+" ");
                temp = temp.prev;
                
            }

        }
    }

    public static void addAt(int index, int data){

    }
    public static void main(String[] args) {

         
        DoublyLinkedList dLL = new DoublyLinkedList();
        
        dLL.addLast(0);
        dLL.addLast(1);
        dLL.addLast(2);
        dLL.addLast(3);
        dLL.addLast(4);
        dLL.displayAllByTail();
      
        
    }
}
