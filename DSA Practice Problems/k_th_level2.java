import java.util.*;

public class k_th_level2 {
   static class Node {
      int data;
      Node left, right;

      public Node(int d) {
         this.data = d;
      }

   }

   public static class BinaryNode {
      static int indx = -1;

      public static Node bt(int arr[]) {

         indx++;

         if (arr[indx] == -1) {
            return null;
         }
         Node newNode = new Node(arr[indx]);

         newNode.left = bt(arr);
         newNode.right = bt(arr);

         return newNode;

      }
   }

   public static void print(Node node) {
      if (node == null) {
         return;
      }
      System.out.print(node.data + " ");
      print(node.left);
      print(node.right);

   }

   public static void k_th_level2(Node root,int k, int level){

      if(root==null){
         return;
      }

      if(level==k){
         System.out.print(root.data+" ");
         return;
      }

      k_th_level2(root.left, k, level+1);
      k_th_level2(root.right, k, level+1);
   }

   public static void main(String ar[]) {
      // int arr[] = {1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
      // BinaryNode d = new BinaryNode();

      // Node root = d.bt(arr);
      Node root = new Node(1);
      root.left = new Node(2);
      root.left.left = new Node(4);
      root.left.right = new Node(5);

      root.right = new Node(3);
      root.right.left = new Node(6);
      root.right.right = new Node(7);
      k_th_level2(root,3,1);

      // print(root);

      


   }
}
