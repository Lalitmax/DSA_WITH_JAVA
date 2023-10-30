public class K_th_level_of_a_tree {
   static class Node{
      int data;
      Node left,right;
      public Node(int data){
         this.data = data;
      }

   }

   public static void kThLevel(Node root,int level, int k){
      if(root ==null){
         return;
      }

      if(level==k){
         System.out.print(root.data+" ");
         return;
      }

      kThLevel(root.left,level+1,k);
      kThLevel(root.right,level+1,k);


   }
   public static void main(String s[]){
      Node root = new Node(1);
      root.left = new Node(2);
      root.left.left = new Node(4);
      root.left.right = new Node(5);
      root.right = new Node(3);
      root.right.left = new Node(6);
      root.right.right = new Node(7);

      int k=3;
      kThLevel(root,1,k);

   }
}
