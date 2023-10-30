import java.util.LinkedList;
import java.util.Queue;

public class Transform_to_sum_tree {

   static class Node{
      int data;
      Node left,right;

      Node(int data){
         this.data= data;
      }
   }

   public static int transformSum(Node root){
      if(root == null){
         return 0;
      }

      int leftValue = transformSum(root.left);
      int rightValue = transformSum(root.right);

      int num  = root.data;

      root.data = leftValue+rightValue;

      return num+root.data;



   }

   public static void preorder(Node root){
      if(root==null){
         return;
      }

      System.out.print(root.data+" ");
      preorder(root.left);
      preorder(root.right);

   }


   public static void main(String[] args) {

      Node root = new Node(1);
      root.left = new Node(2);
      root.left.left = new Node(4);
      root.left.right = new Node(5);
      root.right = new Node(3);
      root.right.left = new Node(6);
      root.right.right = new Node(7);

      transformSum(root);

      preorder(root);
      
      


      Queue<Node> q = new LinkedList<>();

      q.add(root);
      q.add(null);

      while(!q.isEmpty()){
         Node currNode = q.remove();
         if(currNode==null){
            System.out.println();
            if(q.isEmpty()){
               break;
            }else{
               q.add(null);
            }
         }else{

            System.out.print(currNode.data+" ");
            if(currNode.left!=null){
               q.add(currNode.left);
            }

            if(currNode.right!=null){
               q.add(currNode.right);
            }
         }
      }




      
   }
} 
