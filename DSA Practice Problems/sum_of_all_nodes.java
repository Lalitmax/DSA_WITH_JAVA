public class sum_of_all_nodes{
   public static class Node{
      Node left,right;
      int data;
      public Node(int d){
         data=d;
      }
   }
   private static StringBuilder sb = new StringBuilder("");
   public static void getSum(Node root){
      if(root==null){
          System.out.print("0 ");
         return;
      }

      
       System.out.print(root.data+" ");
      getSum(root.left);
      getSum(root.right);
      // sb.append(root.data+" ");
      //   System.out.print(root.data+" ");
           


      

   }
   public static void main(String s[]){
      // sum=0;
      Node root = new Node(1);
      root.left = new Node(2);
      root.left.left = new Node(4);
      root.left.right = new Node(5);
      root.right = new Node(3);
      root.right.left = new Node(6);
      root.right.right = new Node(7);
      getSum(root);
      System.out.println(sb);


   }
}