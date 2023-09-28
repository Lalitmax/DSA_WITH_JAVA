public class Lowest_common_ancestor_approach2 {
   public static class Node{
      int data;
      Node left,right;
      public Node(int d){
         data = d;
      }
   }

   public static Node lca2(Node root, int n1, int n2){
      // base case
      if(root == null){
         return null;
      }

      if(root.data ==n1 || root.data == n2){

         return root;

      }

      Node leftNode = lca2(root.left,n1,n2);
      Node rightNode = lca2(root.right,n1,n2);

      if(leftNode==null){
         return rightNode;
      }

      if(rightNode==null){
         return leftNode;
      }

      return root;


   }
   public static void main(String s[]){

      Node root = new Node(1);
      root.left = new Node(2);
      root.left.left = new Node(4);
      root.left.right = new Node(5);
      root.right = new Node(3);
      root.right.left = new Node(6);
      root.right.right = new Node(7);
      int n1 = 4;
      int n2 = 5;

      Node ans = lca2(root,n1,n2);
      System.out.println(ans.data);
    

   }
}
