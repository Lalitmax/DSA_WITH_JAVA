 
public class Remove_first_DLL {
    public static class DNode{
        int data;
        DNode next;
        DNode prev;

        public DNode(int data){
            this.data = data;
        }
    }

    public static DNode head=null;
    public static DNode tail=null;
    public static int size=0;

    public static class LinkedList{

        public void addFirst(int value){
            DNode temp = new DNode(value);
            size++;
            if(head==null){
                head =tail = temp;
                return;
            }

            temp.next = head;
            head.prev = temp;
            head = temp;
        }

        public void print(){
            DNode temp = head;
            while(temp!=null){
                System.out.print(temp.data+"<->");
                temp  = temp.next;
            }
            System.out.print(temp);
            System.out.println();

        }

        public int removeFirst(){
            if(head ==null){
                System.out.print("Empty");
                return Integer.MIN_VALUE;
            }
            if(size==1){
                int value=head.data;
                head =tail = null;
                size--;
                return value;
            }
            int value = head.data;
            head = head.next;
            head.prev = null;
            size--;

            return value;

        }
    }

    public static void main(String[] args) {
        LinkedList dll = new LinkedList();

        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addFirst(4);
        dll.addFirst(5);
        System.out.println(dll.removeFirst());
        dll.print();


    }
}

