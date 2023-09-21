import java.util.*;
public class level_order_practice {
   static class Node{
      int data;
      Node left,right;

      public Node(int data){
         this.data = data;
      }
   }

   public static void findLevel(Node root){
      Queue<Node> q = new LinkedList<>();

      q.add(root);
      q.add(null);

      while(!q.isEmpty()){
         Node curr = q.remove();
         if(curr!=null){
            System.out.print(curr.data+" ");
            if(curr.left!=null){
               q.add(curr.left);
            }
            if(curr.right!=null){
               q.add(curr.right);
            }
         }else{
            System.out.println();
            if(q.isEmpty()){
               break;
            }else{
               q.add(null);
            }
            
         }
      }



   }
   public static void main(String s[]){
       Node root = new Node(1);
       root.left = new Node(2);
       root.left.left = new Node(4);
       root.left.right  = new Node(5);

       root.right = new Node(3);
       root.right.left = new Node(6);
       findLevel(root);

   }
}
