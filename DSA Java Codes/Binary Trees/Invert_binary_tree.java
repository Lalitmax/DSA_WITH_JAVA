import java.util.*;
public class Invert_binary_tree {

   static class Node{
      int data;
      Node left,right;

      Node(int data){
         this.data = data;
      }
   }

   public static int invertTree(Node root){

     return 0;



   }
   public static void main(String[] args) {
      Node root = new Node(4);
      root.left = new Node(2);
      root.left.left = new Node(1);
      root.left.right = new Node(3);
      root.right = new Node(7);
      root.right.left = new Node(6);
      root.right.right = new Node(9);

      ArrayList<Integer> al = new ArrayList<>();

      Queue<Node> q = new LinkedList<>();

      q.add(root);
      q.add(null);

      while(!q.isEmpty()){
         Node currNode = q.remove();

         if(currNode!=null){
            System.out.print(currNode.data+" ");
            
            if(currNode.right!=null){
               q.add(currNode.right);

            }

            if(currNode.left!=null){
               q.add(currNode.left);
            }
         }else{
            if(q.isEmpty()){
               break;
            }else{
               q.add(null);
            }
         }
      }



      



      
   }
}
