public class Height_of_a_tree {
   static class Node{
      int data;
      Node left,right;

      public Node(int d){
         this.data = d;
         this.left=null;
         this.right=null;
      }

   }

   public static class BinaryTree{
      static int indx=-1;

      public static Node buildTree(int nodes[]){
         indx++;
         if(nodes[indx]==-1){
            return null;
         }

         Node newNode  = new Node(nodes[indx]);

         newNode.left = buildTree(nodes);
         newNode.right = buildTree(nodes);

         return newNode;

      }
   }

   public static int height(Node root){

      if(root==null){
         return 0;
      }

      int leftHeight = height(root.left);
      int rightHeight = height(root.right);

      int height = Math.max(leftHeight,rightHeight)+1;

      return height;
   }
   
   public static void main(String[] args) {
      int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
      BinaryTree tree   = new BinaryTree();

      Node root = tree.buildTree(nodes);

      System.out.println(height(root));
      

      
   }
}
