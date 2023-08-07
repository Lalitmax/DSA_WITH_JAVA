
public class Removing_cycle_in_ll {
    public static class Node {
        int data;
        Node next;

        public Node(int v) {
            data = v;
        }
    }

    public static Node head;
    public static Node tail;

    public static void print() {
        Node temp = head;
        while (temp != null) {

            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static boolean isCycle() { // floid's cycle finding algorithm
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
            if (slow == fast) {
                return true; // exist cycle
            }
        }

        return false; // not cycle
    }

    public static void remCycle(){
        Node slow = head;
        Node fast = head;
         
        // detect cycle
        boolean cycle = false; 
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow==fast){
                cycle = true;
                break;
            }

        }
        if(cycle==false){
            return;
        }
        Node pre = null;
        slow=head;

        // finding meeting point
        while(slow!=fast){
            pre = fast;
            slow = slow.next;
            fast = fast.next;
        }
        // removing cycle
        pre.next = null;
    }

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        Node temp = new Node(12);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next = temp;


        System.out.println(isCycle());
        remCycle();
        System.out.print(isCycle());

    }
}
