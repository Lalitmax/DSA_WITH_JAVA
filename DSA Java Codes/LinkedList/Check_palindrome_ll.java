public class Check_palindrome_ll {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {
        Node head = null;
        Node tail = null;
        int sz = 0;

        void addLast(int value) {
            Node temp = new Node(value);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            sz++;
        }

        int size() {
            return sz;
        }

        Node findMid(Node head){
            Node slow = head;
            Node fast = head;

            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }

            return slow;
        }

        boolean checkPalindrome(){
            // check if 1 and 0
            if(head==null || head.next==null){
                return true;
            }

            Node midNode=findMid(head);
            Node curr=midNode;
            Node temp,pre=null;

            // reverse mid  to end
            while(curr!=null){
                temp = curr.next;
                curr.next=pre;
                pre=curr;
                curr=temp;
            }

            // check pladroem
            Node right = pre;
            Node left = head;

            while(right!=null){
                if(left.data!=right.data){
                    return false;
                }
                left=left.next;
                right=right.next;
            }

            return true;



        }

        void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }

        }
    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);
        ll.addLast(1);
        // ll.print();
        System.out.println(ll.checkPalindrome());

    }

}
