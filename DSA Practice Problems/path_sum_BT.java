public class path_sum_BT {
   static class Node{
      int data;
      Node left,right;

      public Node(int data){
         this.data=data;
         this.left=null;
         this.right=null;
      }
   }

   public static class  BinaryTree{
      static int indx=-1;
      public static Node buildTree(int  nodes[]){
         indx++;
         if(nodes[indx]==-1){
            return null;
         }

         Node newNode = new Node(nodes[indx]);
         newNode.left = buildTree(nodes);
         newNode.right  = buildTree(nodes);

         return newNode;

      }

   }
    static boolean flag = false; 
   public static void isPathSum(Node root,int sum,int t){
      if(root==null){
         return;
      }

      sum +=root.data;
      if(root.left==null && root.right==null && sum==t){
         flag=true;
      }

      isPathSum(root.left,sum,t);
      isPathSum(root.right,sum,t);
      

   }
   public static void main(String s[]){
      Node root = new Node(5);
      root.left = new Node(4);
      root.left.left = new Node(11);
      root.left.left.left = new Node(7);
      root.left.left.right = new Node(2);
      root.right = new Node(8);
      root.right.left  = new Node(13);
      root.right.right = new Node(4);
      root.right.right.right = new Node(1);
      flag = false;
      int target = 20;
      isPathSum(root,0,target);
      System.out.print(flag);



   }
}
