import java.util.*;

public class Sorting_An_ArrayList {

    public static void sort(ArrayList<Integer> list){
        int n = list.size();

        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                if(list.get(j)>list.get(j+1)){
                    int temp = list.get(j);
                    list.set(j,list.get(j+1));
                    list.set(j+1,temp);
                }
            }
        }
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(131);
        list.add(12);
        list.add(1322);
        list.add(14);
        list.add(115);


        // sort(list);
        // System.out.println(list);
        // Collections.sort(list); // Ascending
        // System.out.print(list);

        // Deascending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.print(list);

    }


    
}
