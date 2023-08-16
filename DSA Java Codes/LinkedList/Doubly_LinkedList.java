public class Doubly_LinkedList {
    public static class DNode {
        int data;
        DNode next;
        DNode prev;

        public DNode(int data) {
            this.data = data;
        }
    }

    // public static DNode head;
    // public static DNode tail;

    public static void display(DNode head) {
        DNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print(temp);
        System.out.println();
    }

    public static void displayRev(DNode tail) {
        DNode temp = tail;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.prev;
        }
        System.out.print(temp);
        System.out.println();
    }

    public static void main(String[] args) {
        DNode a = new DNode(1);
        DNode b = new DNode(2);
        DNode c = new DNode(3);
        DNode d = new DNode(4);
        DNode e = new DNode(5);

        a.prev = null;
        // conect next
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        // connect prev
        b.prev = a;
        c.prev = b;
        d.prev = c;
        e.prev = d;

        display(a);
        displayRev(e);

    }
}
