import java.util.ArrayList;
import java.util.*;

public class Most_frequent_number_ArrayList {

    public static int mostFre(ArrayList<Integer> list, int key){
        
        
        int freqent[] = new int[1000];

        // fint frequency
        for(int i=0; i<list.size(); i++){
            if(list.get(i)==key){
                freqent[list.get(i+1)-1]++;
            }
        }

        int maxOcurr=Integer.MIN_VALUE;
        int ans=0;

        for(int i=0; i<freqent.length; i++){
            if(freqent[i]>maxOcurr){
                maxOcurr=freqent[i];
                ans = i+1;
            }
        }

        return ans;


    }

    public static void main(String[] args) {
        // 1,100,200,1,100
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);
        int key=2;
        System.out.print(mostFre(list,key));
    

    }
}
