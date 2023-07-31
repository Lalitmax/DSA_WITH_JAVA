
    

public class Iterative_search {
    public static class Node {
        int data;
        Node next;
        

        public Node(int data) {
            this.data = data;
        }
    }

    // public static Node head = null;
    // public static Node tail = null;

    public static class LinkedList {
        Node head = null;
        Node tail = null;
        int size=0;
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

        int size(){
            return size;
        }

        int removeFirst() {
            if(size==0){
                System.out.println("LL is empty");
                return Integer.MIN_VALUE;
            } else if(size==1){
                int v = head.data;
                head = tail = null;
                size--;
                return v;
            }
            int v = head.data;
            head = head.next;
            size--;
            return v;

        }

        int removeLast(){
            
            if(size==0){
                System.out.println("LL is empty");
                return Integer.MIN_VALUE;

            } else if(size==1){
                int v=tail.data;
                head = tail =null;
                size--;
                return v;

            }
            
            Node prev = head;
            int v = prev.next.data;
            for(int i=0; i<size-2; i++){
                prev= prev.next;
            }

            prev.next =null;

            tail = prev;
            size--;
            return v;
            


        }

        void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int helper(Node head, int key){
            if(head ==null){
                return -1;
            }

            if(head.data==key){
                return 0;
            }

            int indx = helper(head.next,key);

            if(indx==-1){
                return -1;
            }

            indx++;
            return indx;

            
        }

        int searchRec(int key){
            return helper(head,key);
        }

    }

    public static int search(LinkedList ll, int key){
        Node temp = ll.head;
        for(int i=0; i<ll.size(); i++){
            if(temp.data==key){
                return i;

            }
            temp = temp.next;
            
        }

        return -1;

    }



    
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(44);
        ll.addLast(5);
        //  System.out.println(ll.tail.next);
        int key = 1;
        System.out.println(ll.searchRec(3));


    }

}
