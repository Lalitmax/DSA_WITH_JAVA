

public class Remove_at_any_index_dll {
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
   
         void addTail(int data) {
            DNode temp = head;
            DNode newNode = new DNode(data);
            if(head==null){
               head =tail = newNode;
               return;
            }
            while (temp.next != null) {
               temp = temp.next;
            }
   
            temp.next = newNode;
            newNode.prev = temp;
   
         }
   
         void addAt(int indx, int data) {
            DNode temp = head;
            DNode newNode = new DNode(data);
            if (indx == 0) {
               addFirst(data);
               return;
            }
   
            if (head == null || head.next == null) {
               if (indx == 0) {
                  addFirst(data);
                  return;
               } else if (indx == 1) {
                  addTail(data);
                  return;
               }else {
                  System.out.println("Wrong indx");
               }
            }
   
            for (int i = 0; i < indx - 1; i++) {
               temp = temp.next;
               if(temp==null){
                  System.out.println("Wrong index");
                  return;
               }
            }
            if(temp.next==null || temp==null){
               addTail(data);
               return;
            }
   
            newNode.next = temp.next;
            temp.next.prev = newNode;
   
            temp.next = newNode;
            newNode.prev = temp;
         }
   
         void removeFirst(){
            if(head==null || head.next==null){
               head=tail=null;
               return;
            }
   
            head=head.next;
            head.prev = null;
   
         }


         void removeAt(int indx){

            if(indx==0){
               removeFirst();
               return;
            }

            DNode temp = head;
            for(int i=0; i<indx-1; i++){
               temp = temp.next;
            }
            temp.next = temp.next.next;
            temp.next.prev = temp;
         }
      }
   
      public static void main(String[] args) {
         LinkedList dll = new LinkedList();
   
         dll.addTail(1);
         dll.addTail(2);
         dll.addTail(3);
         dll.addTail(4);
         dll.addTail(5);
         dll.print();
         dll.removeAt(2);
         dll.print();
   
      }
   }
