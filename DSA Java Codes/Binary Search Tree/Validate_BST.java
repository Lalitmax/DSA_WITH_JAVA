
import java.util.ArrayList;


public class Validate_BST {
   public static class Node {
      int data;
      Node left, right;

      Node(int data) {
         this.data = data;
      }
   }

   public static Node insert(Node root , int val){
      if(root==null) return new Node(val);

      if(val<root.data){
         root.left = insert(root.left,val);
      }else{
         root.right = insert(root.right,val);
      }

      return root;
   }
   
   // for printing
   public static void inOrder(Node root) {
      if (root == null) {
         return;
      }

      inOrder(root.left);
      System.out.print(root.data + " ");
      inOrder(root.right);

   }

   public static boolean isValidBST(Node root, Node min, Node max){
      if(root==null) return true;

      if(min!=null && min.data>=root.data){
         return false;
      }else if (max!=null && max.data<=root.data){
         return false;
      }

      boolean leftAns = isValidBST(root.left,min,root);
      boolean rightAns = isValidBST(root.right,root,max);

      return leftAns && rightAns;

      
   }

   public static void main(String args[]){
      
      // int values[] = {8,5,3,1,4,6,10,11,14};
      int values[] = {3,3,3};

      Node root = null;
      for (int i = 0; i < values.length; i++) {
         root = insert(root, values[i]);
      }
      // inOrder(root);

      System.err.println(isValidBST(root,null,null));


  

   }
}

