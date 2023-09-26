import java.util.*;
public class k_th_level {
   static class Node{
      int data;
      Node left,right;

      public Node(int data){
         this.data=data;
         this.left=null;
         this.right=null;
      }
   }

   public static void k_th_level(Node root,int level,int k){
      if(root==null){
         return;
      }

      if(level ==k){
         System.out.print(root.data+" ");
      }
      level++;
      k_th_level(root.left,level,k);
      k_th_level(root.right,level,k);



   }

   public static void printLevel(Node root,int level){
     
      Queue<Node> q = new LinkedList<>();

      q.add(root);
      q.add(null);
      int cnt=1;

      while(!q.isEmpty()){
         Node currNode = q.remove();
         if(currNode!=null){
           if(cnt==level){
             System.out.print(currNode.data+" ");
           }
            if(currNode.left!=null){
               q.add(currNode.left);
            }


            if(currNode.right!=null){
               q.add(currNode.right);

            }
         }else{
            System.out.println();
            cnt++;
            if(q.isEmpty()){
               break;
            }else{
               q.add(null);
            }


         }
      }



   }

   public static void main(String s[]){
      Node root = new Node(1);
      root.left = new Node(2);
      root.left.left = new Node(4);
      root.left.right = new Node(5);
      root.right = new Node(3);
      root.right.left = new Node(6);
      root.right.right = new Node(7);
      // k_th_level(root,1,2 );
      printLevel(root,3);


   }
}
