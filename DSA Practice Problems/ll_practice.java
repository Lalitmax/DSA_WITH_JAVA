class ll_practice {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head = null;
    public static Node tail = null;
    public static int size=0;

    public static void addLast(int data){
        Node newNode = new Node(data);

        if(head==null){
            head = newNode;
            tail = newNode;
            
        }else{
            tail.next = newNode;
            tail = tail.next;
             
        }
        size++;
         
    }

    public static void addFirst(int data){
        Node newNode = new Node(data);

        if(head==null){
            head=newNode;
            tail = head;
        }else{
            newNode.next = head;
            head=newNode;

        }
        size++;
    }

    public static void addAt(int index, int data){
        Node newNode = new Node(data);

        if(head==null){

            if(index==0){
                addFirst(data);
            }else{
                System.out.println("Out of bound LL");
            }
        }else{
            if(index==0){
                addFirst(data);
            }else

            if(index==size){
                addLast(data);
            } else if(index>size){
                System.out.println("Out of Bound LL");
            }else{
                Node temp = head;


                for(int i=0; i<index-1; i++){
    
                    temp = temp.next;
    
                }
    
                newNode.next = temp.next;
                temp.next=newNode;
            }

           



        }
        size++;
    }

    public static void reverse(){
        if(head==null || head.next==null) return;
        

        Node prevNode = head;
        Node currNode = head.next;

        while(currNode!=null){

            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // update prev curr  
            prevNode=currNode;
            currNode=nextNode;


        }

        head.next=null;
        head = prevNode;

    }

    public static void displayNode(){
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

   public static void main(String[] args) {
    addLast(1);
    addLast(2);
    addLast(3);
    addLast(4);
    addLast(5);

    displayNode();
    System.out.println();
    reverse();
    displayNode();

     

     

    
   }

    
}