

import java.util.*;
public class find_all_duplicate_subtree {

   static class Node {
      int data;
      Node left, right;

      Node(int data) {
         this.data = data;
      }
   }

   public static void levelOrder(Node root) {

      Queue<Node> q = new LinkedList<>();

      q.add(root);
      q.add(null);

      while (!q.isEmpty()) {
         Node currNode = q.remove();

         if (currNode != null) {
            System.out.print(currNode.data+" ");
             if (currNode.left != null) {
               q.add(currNode.left);
            }

            if (currNode.right != null) {
               q.add(currNode.right);
            }

           

         } else {
            System.out.println();
            if (q.isEmpty()) {
               break;
            } else {
               q.add(null);

            }
         }
      }

      

   }

   
   public static void main(String[] args) {
      Node root = new Node(1);
      root.left = new Node(3);
      root.left.left = new Node(3);
      root.left.right = new Node(2);
      root.right = new Node(3);
     

      levelOrder(root);
      
    

      
   }
}
