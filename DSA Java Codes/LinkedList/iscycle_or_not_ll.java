public class iscycle_or_not_ll {
    public static class Node {
        int data;
        Node next;
        public Node(int v){
            data = v;
        }
    }

    public static Node head;
    public static Node tail;

    public static void print(){
        Node temp = head;
        while(temp!=null){

            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public static boolean isCycle(){ // floid's cycle finding algorithm
        Node slow = head;
        Node fast = head;
        while(fast !=null && fast.next!=null){
            slow=slow.next; // +1
            fast = fast.next.next; // +2
            if(slow==fast){
                return true; // exist cycle
            }
        }

        return false; // not cycle
    }
    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next = head;

        System.out.print(isCycle());
        
    }
}
