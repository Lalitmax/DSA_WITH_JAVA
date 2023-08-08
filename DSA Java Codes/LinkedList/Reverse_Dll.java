
public class Reverse_Dll {
    public static class DNode {
        int data;
        DNode next;
        DNode prev;

        public DNode(int data) {
            this.data = data;
            prev  = null;
        }
    }

    public static DNode head = null;
    public static DNode tail = null;

    public static class LinkedList {

        public void addFirst(int value) {
            DNode temp = new DNode(value);
            if (head == null) {
                head = tail = temp;
                return;
            }

            temp.next = head;
            head.prev = temp;
            head = temp;
        }

        public void print() {
            DNode temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.print(temp);
            System.out.println();

        }
        public void printRev() {
            DNode temp = tail;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.prev;
            }
            System.out.print(temp);
            System.out.println();

        }


        // add last
        public void addLast(int value){
            DNode temp = new DNode(value);

            if(head==null){
                head=tail = temp;
                
            }else {
                tail.next = temp;
                temp.prev = tail;
                   tail = temp;
                }
        }

        // reverse DLL

        public static void reverse(){
            DNode curr = head;
            DNode pre = null;
            DNode temp = null;

            while(curr!=null){
                temp = curr.next;
                curr.next= pre;
                curr.prev = pre;
                pre= curr;
                curr= temp;
            }
            head = pre;
        }
    }

    public static void main(String[] args) {
        LinkedList dll = new LinkedList();

        dll.addLast(1);
        dll.addLast(2);
        dll.addLast(3);
        dll.addLast(4);
        dll.addLast(5);
        dll.print();
        // dll.printRev();
        dll.reverse();
         dll.print();

    }
}
