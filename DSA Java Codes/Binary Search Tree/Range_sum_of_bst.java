public class Range_sum_of_bst {
   static class Node{
      int data;
      Node left,right;
      Node(int d){
         data = d;
      }
   }
   public static int rSum =0;

   public static void rangeSum(Node root, int k1, int k2){
      if(root==null) return;
      if(root.data>=k1 && root.data<=k2){
         rangeSum(root.left,k1,k2);
         rSum +=root.data;
         rangeSum(root.right,k1,k2);
      }else if(root.data<k1){
         rangeSum(root.left,k1,k2);
      }else{
         rangeSum(root.right,k1,k2);
      }

   }
   public static void main(String[] args) {
      rSum=0;
      Node root = new Node(8);
      root.left = new Node(5);
      root.left.left = new Node(3);
      root.left.right = new Node(6);
      root.right = new Node(11);
      root.right.right = new Node(20);
      rangeSum(root,8,20);
      System.out.print(rSum);




      
   }
}
