public class Diameter_of_a_tree_approach2 {
   static class Node{
      int data;
      Node left,right;
      public Node(int data){
         this.data = data;
      }
   }

   static class Info{
      int diam;
      int ht;
      public Info(int d, int h){
         this.diam = d;
         this.ht = h;
      }


   }

   public static Info diameter(Node root){

      if(root==null) {
         return new Info(0,0);
      }

      Info leftDiam = diameter(root.left);
      Info rightDiam = diameter(root.right);


      int maxDiam = Math.max(Math.max(leftDiam.diam, rightDiam.diam), leftDiam.ht+rightDiam.ht+1);

      int maxHeight =Math.max(leftDiam.ht,rightDiam.ht)+1;

      Info newInfo = new Info(maxDiam,maxHeight);

      return newInfo;


   }
   public static void main(String[] args) {

      Node root = new Node(1);
      root.left = new Node(2);
      root.left.left= new Node(4);
      root.left.right = new Node(5);
      
      root.right = new Node(3);
      root.right.left = new Node(6);
      root.right.right = new Node(7);

     Info ans =  diameter(root);
      System.out.println(ans.diam);

      
   }
}
