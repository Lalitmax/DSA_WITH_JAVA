import java.util.*;

public class Levelorder_traversal {
   static class Node{
      int data;
      Node left;
      Node right;

      public Node(int d){
         this.data=d;
         this.left=null;
         this.right=null;
      }
   }

   public static class BinaryTree{
      static int indx = -1;
      public static Node buildTree(int nodes[]){
         indx++;
         if(nodes[indx]==-1){
            return null;
         }

         Node newNode = new Node(nodes[indx]);

         newNode.left = buildTree(nodes); 
         newNode.right = buildTree(nodes);

         return newNode;
      }

   }

    
   public static void main(String args[]){
      int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

      BinaryTree tree = new BinaryTree();
      Node root  = tree.buildTree(nodes);

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
