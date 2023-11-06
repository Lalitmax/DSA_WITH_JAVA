public class AVLTree {
   public static class Node{
      int data,height;
      Node left,right;

      Node(int data){
         this.data=data;
         height=1;

      }
   }

   public static Node root;

   public static int height(Node root){
      if(root==null){
         return 0;
      }

      return root.height;
   }

   public static int getBalance(Node root){
      if(root==null){
         return 0;
      }

      return height(root.left)-height(root.right);
   }

   public static Node leftRotate(Node x){
      Node y = x.right;
      Node t2 = y.left;

      // perform rotation
      y.left  = x;
      x.right = t2;

      // update height
      x.height = Math.max(height(x.left),height(x.right))+1;
      y.height = Math.max(height(x.left),height(x.right))+1;

      return y;// return new root;
   }

   public static Node rightRotate(Node y){
      Node x = y.left;
      Node t2 = x.right;

      // perform rotation
      x.right = y;
      y.left = t2;

      // update height
      y.height = Math.max(height(y.left),height(y.right))+1;
      x.height = Math.max(height(x.left),height(x.right))+1;


      // return new root;
      return x;

   }

   public static void preOrder(Node root){
      if(root==null) return;

      System.out.print(root.data+" ");
      preOrder(root.left);
      preOrder(root.right);


   }

   public static Node insert(Node root, int key){
      if(root==null){
         return new Node(key);
      }

      if(root.data<key){
         root.right = insert(root.right,key);
      }else if(root.data>key){
         root.left = insert(root.left,key);
      }else 
      return root;

      // update root height
      root.height = Math.max(height(root.left),height(root.right))+1;

      // get root balance's factor
       int bf = getBalance(root);

       // left left case
       if(bf>1 && key>root.left.data){
         return rightRotate(root);
       }

       // right right case
       if(bf<-1 && key>root.right.data){
         return leftRotate(root);
       }

       // left right case
       if(bf>1 && key>root.left.data){
         root.left = leftRotate(root.left);
         return rightRotate(root);
       }

       // right left case

       if(bf<(-1) && key<root.right.data){
         root.right = rightRotate(root.right);  
         return leftRotate(root);
       }

       return root; // return if avl balanced


      

   }

   public static void main(String args[]){
      root  = insert(root,10);
      root  = insert(root,20);
      root  = insert(root,30);
      root  = insert(root,40);
      root  = insert(root,50);
      root  = insert(root,25);

      preOrder(root);




   }
   
}
