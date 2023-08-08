public class MergeSort_in_ll {
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
        Node findMid(Node head){
            Node slow=head;
            Node fast=head.next;

            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
        }

        Node merge(Node head1, Node head2){
            Node mergedNode = new Node(-1);
            Node temp = mergedNode;

            while(head1!=null && head2!=null){
                if(head1.data<=head2.data){
                    temp.next = head1;
                    head1 = head1.next;
                    temp  = temp.next;
                }else{
                    temp.next = head2;
                    head2 = head2.next;
                    temp  = temp.next;

                }
            }

            while(head1!=null){
                 temp.next = head1;
                head1 = head1.next;
                temp  = temp.next;
            }

            while(head2!=null){
                 temp.next = head2;
                head2 = head2.next;
                temp  = temp.next;
            }

            return mergedNode.next;
        }

        Node mergeSort(Node head){
            // base case
            if(head==null || head.next==null){
                return head;
            }

            // find mid
            Node mid = findMid(head);
            Node rightHead = mid.next;
            mid.next = null;

            // recursion
            Node leftHalf = mergeSort(head);
            Node rightHalf=mergeSort(rightHead);

            // call merge sort
            return merge(leftHalf,rightHalf);

             

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
        ll.head  = ll.mergeSort(ll.head);

        ll.print();
    }
}
