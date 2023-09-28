

public class K_th_ancestor_of_node {

   static class Node{
      int data;
      Node left, right;
      public Node(int d){
         data = d;
      }

   }

   public static int kAncestor(Node root, int n, int k){
      if(root==null){
         return -1;
      }
      if(root.data == n){
         return 0;
      }

      int leftH = kAncestor(root.left,n,k);
      int rightH = kAncestor(root.right,n,k);

      if(leftH==-1 && rightH==-1){
         return -1;
      }

      int max  = Math.max(leftH,rightH);
      if(max+1==k){
         System.out.print(root.data+" ");
      }

      return max+1;
   }
   public static void main(String[] a){
        Node root = new Node(1);
      root.left = new Node(2);
      root.left.left = new Node(4);
      root.left.right = new Node(5);
      root.right = new Node(3);
      root.right.left = new Node(6);
      root.right.right = new Node(7);
      int n  = 7;
      int k=1 ;
      kAncestor(root, n, k);
      // System.out.print(kAncestor(root, n, k));
   }
}
