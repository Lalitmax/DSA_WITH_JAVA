public class Find_length_of_ll {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static int length(Node head){
        int cnt=0;
        while(head!=null){
            cnt++;
            head=head.next;
        }

        return cnt;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(4);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next  = e;
        System.out.print(length(a));
    }

}
