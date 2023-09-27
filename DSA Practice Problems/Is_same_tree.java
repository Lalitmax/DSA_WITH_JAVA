public class Is_same_tree {
   public static class Node{
      int data;
      Node left,right;

      public Node(int data){
         this.data=data;
      }
   }

   public static boolean isSameTree(Node r1 ,Node r2) {
      if(r1==null && r2==null){
         return true;
      }

      if(r1==null || r2==null){
         return false;
      }

      boolean left = isSameTree(r1.left,r2.left);
      boolean right = isSameTree(r1.right, r2.right);

      return left && right;
   }
   public static void main(String s[]){
      Node root1  = new Node(1);
      root1.left = new Node(2);
      root1.right= new Node(3);

      Node root2 = new Node(1);
      root2.left = new Node(2);
      // root2.right = new Node(3);

      System.out.println(isSameTree(root1,root2));




   }
}
