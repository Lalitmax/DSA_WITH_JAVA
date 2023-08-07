import java.util.LinkedList;
public class LinkedList_framework_use {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.addLast(2);
        ll.addLast(3);
        ll.addFirst(1);
        // 1->2->3
        System.out.println(ll);
        // System.out.println(ll.size());

        ll.removeFirst();
        ll.removeLast();
        //[2]
        System.out.println(ll);



    }
}
