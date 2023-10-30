public class Delete_a_node {
   public static class Node{
      int data ;
      Node left,right;
      Node(int data){
         this.data = data;
      }
   }

   public static Node insert(Node root , int data){
      if(root==null){
         return new Node(data);
      }

      if(root.data>data){
         root.left = insert(root.left,data);
         
      }else{
         root.right = insert(root.right,data);
      }

      return root;
   }

   public static Node deleteNode(Node root,int val){
      if(root.data<val){
         root.right = deleteNode(root.right,val);
      }else if(root.data>val){
         root.left = deleteNode(root.left,val);
      }else{ // voila

            //case 1 --> if node left and right is null
            if(root.left==null && root.right ==null){
               return null;
            }

            // case 2 --> if either one is null
            if(root.left ==null){
               return root.right;
            }else if(root.right ==null){
               return root.left;
            }


            // case 3 --> if both not null
            Node IS = findInorderSuccessor(root.right,val);

            root.data  = IS.data;
            root.right = deleteNode(root.right,IS.data);

      }

      return root;
   }
   
   
   public static Node findInorderSuccessor(Node root, int val){
      while(root.left!=null){
         root.left = root.left;
      }
      
      return root;
      
   }
   // for printing 
   public static void inOrder(Node root){
      if(root==null){
         return;
      }

      inOrder(root.left);
      System.out.print(root.data+" ");
      inOrder(root.right);

   }
   
   public static void main(String arg[]){
       int values[] = {8,5,3,1,4,6,10,11,14};
       Node root = null;
       for(int i=0; i<values.length; i++){
         root  = insert(root,values[i]);
       }


       root = deleteNode(root,1);
       inOrder(root);





   }
}
