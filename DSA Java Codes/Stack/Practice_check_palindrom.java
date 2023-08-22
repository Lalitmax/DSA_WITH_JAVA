import java.util.*;
public class Practice_check_palindrom {
   public static class Node{
      char data;
      Node next;


      public Node(char data){
         this.data=data;
         this.next = null;
      }
   }

   public static Node head;
   public static Node tail;

   public static void addLast(char ch){
      Node newNode = new Node(ch);

      if(head==null){
         head=tail = newNode;
      }else {
         tail.next = newNode;
         tail = newNode;
      }
   }

   public static void print(){
      Node temp  = head;
      while(temp!=null){
         System.out.print(temp.data+"->");
         temp = temp.next;
      }
      System.out.println(temp);

   }

   public static Node findMidNode(Node temp){
      Node fast=temp;
      Node slow= temp;

      while(fast!=null && fast.next!=null){
         slow=slow.next;
         fast=fast.next.next;
      }

      return slow;
   }

   public static boolean isPalindrome(){
      Node midNode = findMidNode(head);

      // ************ using Reverse****************//
      
      // Node curr = midNode;
      // Node pre = null;
      // Node temp =null;

      // while(curr!=null){
      //    temp = curr.next;
      //    curr.next = pre;
      //    pre = curr;
      //    curr=temp;
      // }

      // Node right = pre;
      // Node left = head;

      // while(right!=null){
      //    if(right.data!=left.data){
      //       return false;
      //    }
      //    left=left.next;
      //    right=right.next;
      // }

      // ******************Using stack*********************//

      Stack<Character> s = new Stack<>();
      while(midNode!=null && midNode.next!=null){
         
         s.push(midNode.data);
         midNode = midNode.next;

      }
       s.push(midNode.data);


      Node  left = head;
      while(!s.isEmpty()){
         if(left.data !=s.pop()){
            return false;
         }
         left=left.next;
      }
         

      return true;
   }

   public static void main(String[] args) {
      Practice_check_palindrom ll = new Practice_check_palindrom();

      ll.addLast('1');
      ll.addLast('1');
      ll.addLast('3');
      ll.addLast('2');
      ll.addLast('1');
   
      ll.print();
      System.out.println(isPalindrome());
   }
}
