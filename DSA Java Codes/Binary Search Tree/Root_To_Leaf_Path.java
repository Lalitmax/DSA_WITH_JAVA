import java.util.ArrayList;

import org.w3c.dom.Node;

public class Root_To_Leaf_Path {
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
   public static void printPath( ArrayList<Integer> al){
      for(int i=0; i<al.size(); i++){
         System.out.print(al.get(i)+"->");
      }
      System.out.println("Null");
   }

   public static void rootToLeapPath(Node root, ArrayList<Integer> al){

      if(root==null) return;

      al.add(root.data);
      if(root.left==null && root.right ==null){
         printPath(al);
      }
      rootToLeapPath(root.left,al);
      rootToLeapPath(root.right,al);
      al.remove(al.size()-1);


   }

   public static void main(String args[]){
      int values[] = {8,5,3,1,4,6,10,11,14};

      Node root = null;
      for (int i = 0; i < values.length; i++) {
         root = insert(root, values[i]);
      }
      // inOrder(root);
      rootToLeapPath(root,new ArrayList<>());

   }
}
