public class Post_order_traversal {

   public static class Node {
      int data;
      Node left, right;

      public Node(int d) {
         this.data = d;
         this.left = null;
         this.right = null;
      }

   }

   public static class BinaryTree {
      static int indx = -1;

      public static Node buildTree(int nodes[]) {
         // base case
         indx++;
         if (nodes[indx] == -1) {
            return null;
         }

         Node newNode = new Node(nodes[indx]);

         newNode.left = buildTree(nodes);
         newNode.right = buildTree(nodes);

         return newNode;
      }

      public static void postorder(Node root){
         if(root==null){
            return;
         }

         postorder(root.left);
         postorder(root.right);
         System.out.print(root.data+" ");
      }

   }

   
   public static void main(String s[]) {
      int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

      BinaryTree tree = new BinaryTree();

      Node root = tree.buildTree(nodes);

      tree.postorder(root);

   }
}
