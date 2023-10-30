public class Count_of_nodes {
   static class Node{
      int data;
      Node left,right;

      public Node(int data){
         this.data = data;
      }
   }
   public static class BinaryTree{
      static int indx = -1;
      public static Node buildTree(int nodes[]){
         indx++;
         if(nodes[indx]==-1){
            return null;
         }

         Node newNode = new Node(nodes[indx]);

         newNode.left  = buildTree(nodes) ;
         newNode.right  = buildTree(nodes); 

         return newNode;


      }
   }
   public static int countNode(Node root){
      if(root==null){
         return 0;
      }

      int leftCount = countNode(root.left);
      int rightCount = countNode(root.right);

      int totalCount = leftCount+rightCount+1;
      return totalCount;
   }
   public static void main(String srg[]){
      int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
      BinaryTree tree = new BinaryTree();

      Node root= tree.buildTree(nodes);

      System.out.println(countNode(root));

   }
}
