import java.util.ArrayList;

public class Container_With_Most_water_Brute_Force {

    public static int storeWater(ArrayList<Integer> container){
        int maxWater = 0;

        for(int i=0; i<container.size(); i++){
            for(int j=i+1; j<container.size(); j++){
                int ht = Math.min(container.get(i),container.get(j));
                int wt = j-i;
                int currWater = ht*wt;
                maxWater = Math.max(maxWater,currWater);
            }

        
        }
        return maxWater;

    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // 186254837
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.print(storeWater(list));

    }
}
