
public class Search_in_bst {
    public static class Node{
      int data ;
      Node left,right;
      Node(int data){
         this.data = data;
      }
   }



   public static Node insert(Node root, int val){
      if(root==null){
         return new Node(val);
      }

      if(val<root.data){
         root.left = insert(root.left,val);
      }else{
         root.right  = insert(root.right,val);
      }

      return root;
   }

   public static boolean search(Node root, int key){
      if(root==null)return false;
      
      if(root.data==key) return true;
       boolean ans;
      if(key<root.data) {
         ans =  search(root.left,key);
      }else{
         ans = search(root.right,key);
      }
      return ans;

   }

   public static void main(String d[]){
      int values[] = {5,1,3,4,2,7};

      Node root = null;
      for(int i=0; i<values.length; i++){
         root = insert(root,values[i]);
      }

      if(search(root,7)){
         System.out.print("Found");
      }else{
         System.out.print("Not found");
      }
   }
   
}
