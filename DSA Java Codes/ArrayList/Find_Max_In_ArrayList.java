import java.util.*;

public class Find_Max_In_ArrayList {
     public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(131);
        list.add(12);
        list.add(1322);
        list.add(14);
        list.add(115);
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
       
        for(int i=0; i<list.size(); i++){
            if(list.get(i)>max){
                max = list.get(i);
            }
            // max= Math.max(list.get(i),max);

        }
         System.out.print(max);
        
    }
    
}
