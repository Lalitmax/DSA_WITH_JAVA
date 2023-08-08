public class Zigzag_in_ll {
    public static class Node{
        int data;
        Node next;
        public Node(int v){
            data =v;
        }
    }

    public static class LinkedList{
        Node head = null;
        Node tail = null;

        void addLast(int value){
            Node temp = new Node(value);
            if(head==null){
                head = temp;
                
            }else{
                tail.next=temp;
            }
            tail = temp;
        }

        void  print(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
            System.out.print(temp);
            System.out.println();


        }

        void zigZag(){

            // find mid
            Node slow  =head;
            Node fast = head.next;

            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast = fast.next.next;
            }

            Node mid = slow.next;
            slow.next= null;

            // reverse
            Node curr = mid;
            Node temp = null;
            Node pre = null;
            while(curr!=null){
                temp = curr.next;
                curr.next = pre;
                pre = curr;
                curr = temp;
            }

            // do zigzag
            Node left = head;
            Node right = pre;

            Node nextL;
            Node nextR;
            while(left!=null && right!=null){
                nextL = left.next;
                left.next = right;
                nextR = right.next;
                right.next = nextL;

                left = nextL;
                right = nextR;
            }
        }
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(9);
        ll.addLast(2);
        ll.addLast(5);
        ll.addLast(0);
        ll.addLast(7);
        ll.addLast(1);
        ll.print();
        ll.zigZag();
        ll.print();
        
    }
}
