public class Find_the_closest_element_In_BST {
   public static class Node{
      int data;
      Node left,right;
      Node(int d){
         data = d;
      }
   }

   static int closestDiff = Integer.MAX_VALUE;
   static int closestValue;
   public static void minDiff(Node root, int k){
      if(root==null){
         return;
      }

      if(root.data<k){
         
         if(closestDiff>Math.abs(k-root.data)){
            closestDiff  = Math.abs(k-root.data);
            closestValue = root.data;
            
         }
         minDiff(root.right,k);
      }else{
          if(closestDiff>Math.abs(k-root.data)){
            closestDiff  = Math.abs(k-root.data);
            closestValue = root.data;
            
         }
         minDiff(root.left,k);
         

      }

   }
   public static void main(String args[]){
      Node root = new Node(8);
      root.left = new Node(5);
      root.left.left = new Node(3);
      root.left.right = new Node(6);
      root.right = new Node(11);
      root.right.right = new Node(20);
      minDiff(root,19);

      System.out.print(closestValue +" diff :"+closestDiff);



   }
}
