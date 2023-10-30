import java.util.*;
public class delete_leaf_node {

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

   public static Node  deleteLeaf(Node root, int x){
      if(root==null){
         return null;
      }

      root.left  = deleteLeaf(root.left,x);
      root.right = deleteLeaf(root.right,x);


      if(root.data==x && root.left==null && root.right ==null){
         return null;
        
      }

      return root;
   }
   public static void main(String[] args) {
      Node root = new Node(1);
      root.left = new Node(3);
      root.left.left = new Node(3);
      root.left.right = new Node(2);
      root.right = new Node(3);
       Node ans =deleteLeaf(root,3);

      levelOrder(ans);
      
    

      
   }
}
