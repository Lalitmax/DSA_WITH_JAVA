import java.util.ArrayList;
public class Lonely_numbers_in_ArrayList {
    public static ArrayList<Integer> findLonely(ArrayList<Integer> list){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            max=Math.max(max,list.get(i));
        }
        int[] newList = new int[max+1];
        ArrayList<Integer> addLonely = new ArrayList<>();
        
        for(int i=0; i<list.size(); i++){
            newList[list.get(i)]++;
        }
        
        for(int i=0; i<newList.length; i++){
            if(newList[i]==1){
            
                addLonely.add(i);
            }
        }

        for(int i=0; i<addLonely.size(); i++){
           for(int j=0; j<list.size(); j++){
            if(addLonely.get(i)+1==list.get(j) || addLonely.get(i)-1==list.get(j)){
                addLonely.remove(addLonely.get(i));
            }
           }
        }

        return addLonely;


    }
    public static void main(String[] args) {
        ArrayList<Integer> list  = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(3);

        System.out.print(findLonely(list));

    }
}



