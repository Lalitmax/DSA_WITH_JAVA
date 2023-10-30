import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Is_symmetric_or_not {
   static class Node {
      int data;
      Node left, right;

      Node(int data) {
         this.data = data;
      }
   }

  

   public static void levelOrder(Node root) {
      ArrayList<Integer> al = new ArrayList<>();
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
   

   public static Node invertTree(Node root){
      if(root==null){
         return null;
      }

      Node temp = root.left;
      root.left=root.right;
      root.right = temp;

      invertTree(root.left);
      invertTree(root.right);

      return root;
      

   }


   

   public static void main(String[] args) {

      Node root = new Node(4);
      root.left = new Node(2);
      root.left.left = new Node(1);
      root.left.right = new Node(3);
      root.right = new Node(7);
      root.right.left = new Node(6);
      root.right.right = new Node(9);
       levelOrder(root);

      Node root2 = invertTree(root);
       levelOrder(root2);


      




   }
}
