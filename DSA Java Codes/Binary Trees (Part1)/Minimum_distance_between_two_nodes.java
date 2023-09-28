

public class Minimum_distance_between_two_nodes {
   static class Node{
      int data;
      Node right,left;

      public Node(int d){
         data = d;
      }

   }
   public static Node lca(Node root, int n1, int n2){
      if(root == null){
         return null;
      }

      if(root.data ==n1 || root.data==n2){
         return root;
      }

      Node leftNode = lca(root.left,n1,n2);

      Node rightNode  = lca(root.right, n1,n2);

      if(leftNode==null){
         return rightNode;
      }

      if(rightNode ==null){
         return leftNode;
      }

      return root;
   }
   public static int lcaDist(Node root,int n){
      if(root==null){
         return -1;
      }

      if(root.data==n) return 0;

      int leftDist  = lcaDist(root.left,n);
      int rightDist= lcaDist(root.right,n);

      if(leftDist==-1 && rightDist==-1){
         return -1;
      }else if(leftDist==-1){
         return rightDist+1;
      }else{
         return leftDist+1;
      }

   }


   public static int minDist(Node root, int n1, int n2){
      Node lcaNode  = lca(root,n1,n2);

      int leftDist = lcaDist(lcaNode,n1);
      int rightDist  = lcaDist(lcaNode,n2);

      int minDist  = leftDist+rightDist;

      return minDist;
   }
   public static void main(String[] args) {
       Node root = new Node(1);
      root.left = new Node(2);
      root.left.left = new Node(4);
      root.left.right = new Node(5);
      root.right = new Node(3);
      root.right.left = new Node(6);
      root.right.right = new Node(7);
      int n1=4;
      int n2 = 6;
      System.out.print(minDist(root,n1,n2));
      
   }
}
