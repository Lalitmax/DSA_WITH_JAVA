public class Build_a_BST {

   public static class Node{
      int data ;
      Node left,right;
      Node(int data){
         this.data = data;
      }
   }

   public static Node insert(Node root, int data){
      if(root==null){
         root = new Node(data);
         return root;
      }

      if(root.data>data){
         root.left = insert(root.left,data);

      }else{
         root.right = insert(root.right,data);
      }

      return root;
   }

   public static void inOrder(Node root){
      if(root==null){
         return;
      }

      inOrder(root.left);
      System.out.print(root.data+" ");
      inOrder(root.right);

   }

   public static void main(String[] args) {
      int values[] = {5,1,3,4,2,7};

      Node root = null;

      for(int i=0; i<values.length; i++){
         root = insert(root, values[i]);  
      }

      inOrder(root);

      
   }
   
}
