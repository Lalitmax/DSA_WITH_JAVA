import java.util.*;
public class Merge_two_BSTs {
   public static class Node{
      int data;
      Node left,right;
      Node(int data){
         this.data = data;
      }
   }

  

   public static void preOrder(Node root) {
      if (root == null) {
         return;
      }
      System.out.print(root.data + " ");
      preOrder(root.left);
      preOrder(root.right);

   }

   public static Node createBST( ArrayList<Integer> al, int st, int end){
      if(st>end){
         return null;
      }

      int mid = st+(end-st)/2;
      Node newNode = new Node(al.get(mid));
      newNode.left = createBST(al,st,mid-1);
      newNode.right = createBST(al,mid+1,end);

      return newNode;

   }

   public static void inOrder(Node root, ArrayList<Integer> al){
      if(root==null){
         return;
      }

      inOrder(root.left,al);
      al.add(root.data);
      inOrder(root.right,al);

   }

   public static void printInorder(Node root){
      if(root==null){
         return;
      }

      printInorder(root.left);
      System.out.print(root.data+" ");
      printInorder(root.right);

   }

   public static ArrayList<Integer> mergeBst(ArrayList<Integer> al1,ArrayList<Integer> al2){

      int i=0;
      int j=0;
      int n1 = al1.size()-1;
      int n2 = al2.size()-1;
     ArrayList<Integer> newAl= new ArrayList<>();

      while(i<=n1 && j<=n2){
         if(al1.get(i)<al2.get(j)){
            newAl.add(al1.get(i));
            i++;
         }else{
            newAl.add(al2.get(j));
            j++;
         }
      }

      while(i<=n1 ){
          newAl.add(al1.get(i));
            i++;

      }

      while(j<=n2){
          newAl.add(al2.get(j));
            j++;
      }

      return newAl;

      

   }

   public static void main(String ars[]){
      Node bst1 = new Node(2);
      bst1.left = new Node(1);
      bst1.right = new Node(4);


      Node bst2 = new Node(9);
      bst2.left = new Node(3);
      bst2.right =new Node(12);

       ArrayList<Integer> a1 = new ArrayList<>();
       ArrayList<Integer> a2 =new  ArrayList<>();

      inOrder(bst1,a1);
      inOrder(bst2,a2);

      ArrayList<Integer> values =mergeBst(a1,a2);
      Node ansRoot = createBST(values,0,values.size()-1);

      printInorder(ansRoot);


      



   }
   
}
