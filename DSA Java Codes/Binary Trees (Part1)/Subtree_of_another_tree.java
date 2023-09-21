public class Subtree_of_another_tree {
   static class Node{
      int data;
      Node left,right;
      public Node(int data){
         this.data=data;
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
         newNode.left =  buildTree(nodes);

         newNode.right = buildTree(nodes);

         return newNode;

      }

   }

   public static boolean isIdentical(Node nodes, Node subRoot){
      if(nodes==null && subRoot==null){
         return true;
      } else if (nodes==null || subRoot == null || nodes.data!=subRoot.data){
         return false;
      }

      if(!isIdentical(nodes.left,subRoot.left)){
         return false;
      }

      if(!isIdentical(nodes.right, subRoot.right)){
         return false;
      }

      return true;

   }

   public static boolean isSubTree(Node root, Node subRoot){
      if(root==null){ // because subTree is not null
         return false;
      }
      if(root.data==subRoot.data){
         if(isIdentical(root,subRoot)){
            return true;
         }      
      }

      boolean leftAns = isSubTree(root.left,subRoot);  // left subtree of tree is true or not
      boolean rightAns = isSubTree(root.right,subRoot);

      return  leftAns || rightAns;

   }
   public static void main(String s[]){
      Node root = new Node(1);
      root.left = new Node(2);
      root.left.left = new Node(4);
      root.left.right = new Node(5);
      root.right = new Node(3);
      root.right.left= new Node(5);
      root.right.right  = new Node(7);
      /*
               Tree
                1 
               / \
              2   3
             / \ / \
            4  5 5  7
       */

      Node subRoot = new Node(2);
      subRoot.left = new Node(4);
      subRoot.right = new Node(5);

       /* 
             SubtTree
                2 
               / \
              4   5
       */

       System.out.println(isSubTree(root,subRoot));

   }
}
