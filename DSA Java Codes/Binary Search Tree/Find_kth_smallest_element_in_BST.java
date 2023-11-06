import java.util.ArrayList;

import javax.swing.tree.TreeNode;

public class Find_kth_smallest_element_in_BST {
   public static class Node{
      int data;
      Node left,right;
      Node(int d){
         data = d;
      }
   }


   static int cnt = 0;
    static int ans;
   public static void kthSmall(Node root, int k) {
        if (root == null) return;

         kthSmall(root.left, k);
     


        cnt++;   System.out.print(cnt+" ");
        System.out.print(root.data+"th ");

        if (cnt == k) {
           ans=root.data;
           
            // return ; // Return cnt to stop further traversal

        }

       kthSmall(root.right, k);
    }


     public static void main(String args[]){
      Node root = new Node(8);
      root.left = new Node(5);
      root.left.left = new Node(3);
      root.left.right = new Node(6);
      root.right = new Node(11);
      root.right.right = new Node(20);
     kthSmall(root,1);
     System.out.println();
     System.out.println(ans);



   }
}
