public class Sorted_Array_To_Balanced_BST {
   public static class Node{
      int data;
      Node left,right;
      Node(int d){
         data = d;
      }
   }

   public static Node insert(Node root, int val){

      if(root==null){
         return new Node(val);
      }

      if(root.data>val){
         root.left = insert(root.left,val);
      }else{
          root.right = insert(root.right,val);

      }

      return root;
   }
   // pre order traversal
   public static  void preOrder(Node root){
      if(root==null){
         return;
      }
      System.out.print(root.data+" ");
      preOrder(root.left);
      preOrder(root.right);


   }

   public static Node balancedBST(int arr[], int st, int end){

      if(st>end){
         return  null;
      }

      int mid = (st+end)/2;
      Node newNode = new Node(arr[mid]);
      newNode.left = balancedBST(arr,st,mid-1);
      newNode.right = balancedBST(arr,mid+1,end);

      return newNode;
   }

   public static void main(String args[]){
      int arr[]   ={3,5,6,8,10,11,12};

      // Node root = null;
      // for(int i=0; i<arr.length; i++){
      //    root = insert(root,arr[i]);
      // }

      Node root = balancedBST(arr,0,arr.length-1);
      preOrder(root);

   }
}
