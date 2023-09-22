import java.util.*;
public class Top_view_of_a_tree {
   static class Node{
      int data;
      Node left,right;
      public Node(int data){
         this.data = data;
      }
   }
   static class Info{
      Node node;
      int hd;
      public Info(Node node, int hd){
         this.node = node;
         this.hd  = hd;
      }
   }

   public static void topView(Node root){
      // level order
      Queue<Info> q = new LinkedList<>();

      HashMap<Integer,Node> map  = new HashMap<>();
      int min=0,max=0;
      q.add(new Info(root,0));
      q.add(null);

      while(!q.isEmpty()){
         Info curr = q.remove();
         if(curr !=null){
            if(!map.containsKey(curr.hd)){  // first time my hd is occuring

               map.put(curr.hd,curr.node);
            }

            if(curr.node.left!=null){
               q.add(new Info(curr.node.left,curr.hd-1));
               min = Math.min(min,curr.hd-1);
            }

            if(curr.node.right!=null){
               q.add(new Info(curr.node.right,curr.hd+1));
               max = Math.max(max,curr.hd+1);
            }
         }else{
            if(q.isEmpty()){
               break;
            }else{
               q.add(null);
            }
         }
      }

      for(int i=min; i<=max; i++){
         System.out.print(map.get(i).data+" ");
      }

   }
   public static void main(String[] args) {
      Node root = new Node(1);
      root.left  = new Node(2);
      root.left.left = new Node(4);
      root.left.right =new Node(5);

      root.right = new Node(3);
      root.right.left = new Node(6);
      root.right.right = new Node(7);
      /*
               Tree
                1 
               / \
              2   3
             / \ / \
            4  5 5  7
       */

      topView(root);

      
   }
}
