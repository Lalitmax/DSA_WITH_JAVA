
   public class Check_palindrome_Dll {
      public static class DNode {
         int data;
         DNode next;
         DNode prev;
   
         public DNode(int data) {
            this.data = data;
         }
      }
   
      public static DNode head = null;
      public static DNode tail = null;
   
      public static class LinkedList {
   
         public void addFirst(int value) {
            DNode temp = new DNode(value);
            if (head == null) {
               head = tail = temp;
               return;
            }
   
            temp.next = head;
            head.prev = temp;
            head = temp;
         }
   
         public void print() {
            DNode temp = head;
            while (temp != null) {
               System.out.print(temp.data + "->");
               temp = temp.next;
            }
            System.out.print(temp);
            System.out.println();
   
         }
   
         void addTail(int data){
            DNode temp = head;
            DNode newNode = new DNode(data);
            while(temp.next!=null){
               temp  = temp.next;
            }
   
            temp.next = newNode;
            newNode.prev = temp;
   
         }

         boolean isPalindrome(){
            DNode temp = head;
            DNode tempTail = head;

            while(tempTail.next!=null && tempTail!=null){
               tempTail = tempTail.next.next;
            }

            while(temp!=tempTail){
               if(temp.data!=tempTail.data){
                  return false;
               }
               temp=temp.next;
               tempTail = tempTail.prev;
            }
            return true;

         }
      }
   
      public static void main(String[] args) {
         LinkedList dll = new LinkedList();
   
         dll.addFirst(1);
         dll.addFirst(2);
         dll.addFirst(3);
         dll.addFirst(2);
         dll.addFirst(1);

         System.out.print(dll.isPalindrome());
   
      }
   }
   