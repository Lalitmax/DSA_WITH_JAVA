public class Size_of_largest_BST_in_BT {
   public static class Node {
      int data;
      Node left, right;

      Node(int d) {
         data = d;
      }
   }

   public static void preOrder(Node root) {
      if (root == null) {
         return;
      }
      System.out.print(root.data + " ");
      preOrder(root.left);
      preOrder(root.right);

   }

   static class Info {
      boolean isValid;
      int size;
      int min;
      int max;

      Info(boolean isValid, int size, int min, int max) {
         this.isValid = isValid;
         this.size = size;
         this.max = max;
         this.min = min;
      }
   }

   static void print(Info a){

    
      System.out.println(a.isValid);
      System.out.println(a.size);
      System.out.println(a.min);
      System.out.println(a.max);
      System.out.println("First 11111111111111111111111111111111111111111111111111111111");
      System.out.println(" ");




   }

   public static int maxBSTSize = 0;

   public static Info largestBST(Node root) {

      if (root == null) {
         print(new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE));
         return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
      }

      Info leftInfo = largestBST(root.left);
      Info rightInfo = largestBST(root.right);

      int size = leftInfo.size + rightInfo.size + 1;

      int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
      int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));

      if (root.data <= leftInfo.max || root.data >= rightInfo.min) {
         return new Info(false, size, min, max);
      }

      if (leftInfo.isValid && rightInfo.isValid) {
         maxBSTSize = Math.max(maxBSTSize, size);
         print(new Info(true, size, min, max));
         
         return new Info(true, size, min, max);
      }

      print(new Info(false, size, min, max));
      return new Info(false, size, min, max);

   }

   public static void main(String args[]) {
      maxBSTSize = 0;
      Node root = new Node(5);
      root.left = new Node(30);
      root.left.left = new Node(5);
      root.left.right = new Node(20);
      root.right = new Node(60);
      root.right.left = new Node(45);
      root.right.right = new Node(70);
      root.right.right.left = new Node(65);
      root.right.right.right = new Node(80);

      // preOrder(root);

       largestBST(root);

      System.out.println(maxBSTSize);

   }
}
