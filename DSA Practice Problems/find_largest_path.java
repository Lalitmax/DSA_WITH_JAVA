
public class find_largest_path {
   static class Node {
      int data;
      Node left, right;

      public Node(int data) {
         this.data = data;
         this.left = null;
         this.right = null;
      }
   }

   public static class BinaryTree {
      static int indx = -1;

      public static Node buildTree(int nodes[]) {
         indx++;
         if (nodes[indx] == -1) {
            return null;
         }

         Node newNode = new Node(nodes[indx]);
         newNode.left = buildTree(nodes);
         newNode.right = buildTree(nodes);

         return newNode;

      }

   }

   static class flag{
      int maxSum;
      int maxHeight;
      int sum;
   }

   static int sum = 0;
   public static flag height(Node root){
      if(root==null) return null;

      flag lh = height(root.left);
      int ls = lh.maxSum;
      flag rh = height(root.right);
      int rs = rh.maxSum;

      

     if( lh.maxHeight>rh.maxHeight){
         return new flag(sum+lh);
     }

      return Mathmax(Math.max());
   }


   public static void main(String s[]) {
      sum=0;
      Node root = new Node(4);
      root.left = new Node(2);
      root.left.left = new Node(7);
      root.left.right = new Node(1);
      root.left.right.left = new Node(6);

      root.right = new Node(5);
      root.right.left = new Node(2);
      root.right.right = new Node(3);
    
 
      System.out.println(height(root)+"  "  +sum);

   }
}
