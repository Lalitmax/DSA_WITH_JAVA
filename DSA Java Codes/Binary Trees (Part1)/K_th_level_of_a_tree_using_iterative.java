import java.util.*;

public class K_th_level_of_a_tree_using_iterative {

   static class Node {
      int data;
      Node left, right;

      public Node(int data) {
         this.data = data;
      }
   }

   public static void main(String s[]) {
      Node root = new Node(1);
      root.left = new Node(2);
      root.left.left = new Node(4);
      root.left.right = new Node(5);
      root.right = new Node(3);
      root.right.left = new Node(6);
      root.right.right = new Node(7);

      int k = 3;

      Queue<Node> q = new LinkedList<>();
      q.add(root);
      q.add(null);
      int cnt = 1;
      while (!q.isEmpty()) {
         Node currNode = q.remove();

         if (currNode != null) {
            if (cnt == k) {
               System.out.print(currNode.data + " ");
            }
            if (currNode.left != null) {
               if (cnt == k) {
                  System.out.print(currNode.data + " ");
               }
               q.add(currNode.left);

            }

            if (currNode.right != null) {
               if (cnt == k) {
                  System.out.print(currNode.data + " ");
               }
               q.add(currNode.right);
            }
         } else {
            System.out.println();
            cnt++;

            if (q.isEmpty()) {
               break;
            } else {
               q.add(null);
            }

         }

      }

   }
}
