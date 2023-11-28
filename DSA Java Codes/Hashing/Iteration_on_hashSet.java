import java.util.*;
public class Iteration_on_hashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(4);
        hs.add(5);
        hs.add(2);
        hs.add(1);
        hs.add(3);
        hs.add(33);

        
        //a. using Iterator
        Iterator it  = hs.iterator();

        while(it.hasNext()){
            System.out.print(it.next()+" ");

        }
        System.out.println();

        //b. Enhanced for loop
        for(Integer num : hs){
            System.out.print(num+" ");
        }

        
    }
}
