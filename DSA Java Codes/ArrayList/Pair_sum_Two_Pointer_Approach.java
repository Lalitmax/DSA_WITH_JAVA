import java.util.ArrayList;

public class Pair_sum_Two_Pointer_Approach {
    public static boolean pairSum(ArrayList<Integer> list, int target){
        int cnt = 0;
        int lp = 0, rp = list.size()-1;
        while(lp<rp){
            int sum = list.get(lp)+list.get(rp);
            if(sum==target){
                System.out.println("("+lp+","+rp+")");
                cnt++;
            }

            if(sum<target){
                lp++;
            }else{
                rp--;
            }
        }
        if(cnt>0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<>();
    // 1 2 3 4 5 6 
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    int target = 8;
    System.out.println(pairSum(list,target));
    }
    
}
