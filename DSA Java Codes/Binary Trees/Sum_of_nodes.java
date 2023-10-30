
public class Sum_of_nodes {
   static class Node {
      int data;
      Node left, right;

      public Node(int data) {
         this.data = data;
      }
   }

   // public static class BinaryTree {
   //    static int indx = -1;

   //    public static Node buildTree(int nodes[]) {
   //       indx++;
   //       if (nodes[indx] == -1) {
   //          return null;
   //       }

   //       Node newNode = new Node(nodes[indx]);

   //       newNode.left = buildTree(nodes);
   //       newNode.right = buildTree(nodes);

   //       return newNode;

   //    }
   // }
   static int totalSum=0;

   public static int sumOfNodes(Node root) {
      if (root == null) {
         return 0;
      }
      totalSum +=root.data;
      sumOfNodes(root.left);
      sumOfNodes(root.right);

      return totalSum;

     
      

   }

   public static void main(String srg[]) {
      int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
      // BinaryTree tree = new BinaryTree();

      // Node root = tree.buildTree(nodes);
      Node root = new Node(1);
      root.left = new Node(2);
      root.left.left = new Node(4);
      root.left.right = new Node(5);
      root.right = new Node(3);
      root.right.right = new Node(6);

      System.out.println(sumOfNodes(root));

   }
}
