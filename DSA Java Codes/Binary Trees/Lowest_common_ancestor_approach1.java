import java.util.*;
public class Lowest_common_ancestor_approach1 {
   
   static class Node {
      int data;
      Node left, right;

      public Node(int data) {
         this.data = data;
      }
   }
   public static boolean getPath(Node root, int n, ArrayList<Node> path){

      if(root==null){
         return false;
      }

      path.add(root);
      if(root.data==n){
         return true;
      }
      boolean foundLeft = getPath(root.left,n,path);
      boolean foundRight = getPath(root.right,n,path);

      if(foundLeft || foundRight){
         return true;
      }else{
         path.remove(path.size()-1);
         return false;
      }

   }
   public static Node lca(Node root, int n1, int n2){
      ArrayList<Node> path1 = new ArrayList<>();
      ArrayList<Node> path2 = new ArrayList<>();

      getPath(root,n1,path1);
      getPath(root,n2,path2);

      int i=0;
      for(i=0; i<path1.size() && i<path2.size(); i++){
         if(path1.get(i)!=path2.get(i)){
            break;
         }
      }

      Node lca = path1.get(i-1);
  

      return lca;


   }

   public static void main(String s[]){
      Node root = new Node(1);
      root.left = new Node(2);
      root.left.left = new Node(4);
      root.left.right = new Node(5);
      root.right = new Node(3);
      root.right.left = new Node(6);
      root.right.right = new Node(7);

      Node ans = lca(root,4,6);

      System.out.println(ans.data);

   }
}
