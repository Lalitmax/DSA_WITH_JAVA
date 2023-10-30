import java.util.ArrayList;

public class Mirror_A_BST {
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

   public static void mirrorBST(Node root){
      if(root==null) return;

      Node temp = root.left;
      root.left = root.right;
      root.right = temp;
      mirrorBST(root.left);
      mirrorBST(root.right);

   }


   public static void main(String args[]){
      
      int values[] = {8,5,3,1,4,6,10,11,14};


      Node root = null;
      for (int i = 0; i < values.length; i++) {
         root = insert(root, values[i]);
      }
      inOrder(root);
      mirrorBST(root);
      System.out.println();
       inOrder(root);



  

   }
}

