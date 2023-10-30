public class Is_univalued_or_not {
   public static class Node{
      int data;
      Node left,right;

      Node(int data){
         this.data= data;
      }
   }

   public static boolean isUnivalued(Node root, int mainData){
      if(root==null){
         return true;
      }

      boolean left =isUnivalued(root.left,mainData);
      boolean right =isUnivalued(root.right,mainData);

      if((left==true && right ==true) && root.data==mainData){
         return true;
      }else{
         return false;
      }

   }
   public static void main(String[] args) {

      Node root = new Node(2);
      root.left = new Node(2);
      root.left.left = new Node(2);
      root.left.right = new Node(2);
      root.right = new Node(2);

      System.out.println(isUnivalued(root,root.data));
      




      
   }
}
