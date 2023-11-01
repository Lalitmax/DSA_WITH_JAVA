import java.util.*;
public class Convert_bst_to_balanced_bst {
   public static class Node{
      int data;
      Node left,right;
      Node(int d){
         data = d;
      }
   }

   // / pre order traversal


   public static  void preOrder(Node root){
      if(root==null){
         return;
      }
      System.out.print(root.data+" ");
      preOrder(root.left);
      preOrder(root.right);


   }

   public static void inOrder(Node root, ArrayList<Integer> inorder){

      if(root==null) {
         return;
      }

      inOrder(root.left,inorder);
      inorder.add(root.data);
      inOrder(root.right,inorder);

   }

   public static Node balanceBST(ArrayList<Integer> al, int st, int end){

      if(st>end){
         return null;
      }
      int mid = (st+end)/2;

      Node newNode = new Node(al.get(mid));
      newNode.left=balanceBST(al,st,mid-1);
      newNode.right = balanceBST(al,mid+1,end);

      return newNode;

   }


   public static void main(String args[]){
      int arr[] = {3, 5, 6, 8, 10, 11, 12};
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

      ArrayList<Integer> al = new ArrayList<>();
      inOrder(root, al);
      Node newRoot = balanceBST(al,0,al.size()-1);
      preOrder(newRoot);



   }
}
