public class Diameter_of_a_tree {
   static class Node{
      int data;
      Node left,right;

      public Node(int data){
         this.data= data;
      }
   }

   public static class BinaryTree{
      static int indx=-1;
      public static Node buildTree(int nodes[]){
         indx++;
         if(nodes[indx]==-1){
            return null;
         }

         Node newNode = new Node(nodes[indx]);

         newNode.left = buildTree(nodes);
         newNode.right = buildTree(nodes);


         return  newNode;


      }
   }
   public static int heightOfTree(Node root){
      if(root==null) return 0;

      int leftHeight   = heightOfTree(root.left);
      int rightHeight = heightOfTree(root.right);

      int maxHeight = Math.max(leftHeight,rightHeight)+1;

      return maxHeight;
   }

   public static int diameter(Node root){
      if(root==null){
         return 0;
      }

      int leftDiameter = diameter(root.left);
      int leftHeight = heightOfTree(root.left);
      int rightDiameter = diameter(root.right);
      int rightHeight = heightOfTree(root.right);

      int selfDiameter = leftHeight+rightHeight+1;

      int maxDiameter = Math.max(selfDiameter, Math.max(leftDiameter,rightDiameter));

      return maxDiameter;
       

   }
   public static void main(String[] args) {
     
      Node root = new Node(1);
      root.left = new Node(2);
      root.left.left = new Node(4);
      root.left.right = new Node(5);

      root.right = new Node(3);
      root.right.left = new Node(6);
      root.right.right = new Node(7);


      System.out.println(diameter(root));
      
   }
}
