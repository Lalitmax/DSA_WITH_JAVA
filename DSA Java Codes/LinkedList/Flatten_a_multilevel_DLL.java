import org.w3c.dom.Node;

public class Flatten_a_multilevel_DLL {
   public Node flatten(Node head) {

      Node temp = head;
      while(temp!=null){
         Node t= temp.next;
         if(temp.child!=null){
            
            Node c= flatten(temp.child); //agle wale value ko rakh lo jaise 4
            temp.next= c;
            c.prev = temp;

            // Move c to forward
            while(c.next!=null){
               c=c.next;
            }
            c.next= t;
            if(t!=null){
               t.prev = c;
            }
            temp.child=null;
         }
      
         temp = t;

      }
   }


}
