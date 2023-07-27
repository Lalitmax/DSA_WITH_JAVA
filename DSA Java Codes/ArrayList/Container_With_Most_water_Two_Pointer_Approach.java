import java.util.ArrayList;

public class Container_With_Most_water_Two_Pointer_Approach {
    public static int storeWater(ArrayList<Integer> container){
        int maxWater = 0;
        // Time comp = O(n)
        int lp =0, rp=container.size()-1;
        while(lp<rp){
            int ht = Math.min(container.get(lp),container.get(rp));
            int wt = rp-lp;

            int currWater = ht*wt;
            maxWater = Math.max(maxWater,currWater);

            if(container.get(lp)<container.get(rp)){
                lp++;
            }else{
                rp--;
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
