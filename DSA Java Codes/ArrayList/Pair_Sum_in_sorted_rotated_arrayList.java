import java.util.ArrayList;

public class Pair_Sum_in_sorted_rotated_arrayList {

    public static boolean pairSum(ArrayList<Integer> list , int target){
        int piwot = 0,rp=0,lp=0;
        int n= list.size();
        for(int i=0; i<n; i++ ){
            if(list.get(i)>list.get(i+1)){
                piwot = i;
                break;
            }
        }
        lp= piwot+1; // small
        rp = piwot; // largest

        int cnt =0;
        while(lp!=rp){
            int sum = list.get(lp)+list.get(rp);
            if(sum==target){
                System.out.println("("+lp+","+rp+")");
                cnt++;
            }
            if(sum<target){
                lp = (lp+1)%n;

            }else{
                rp = (rp+n-1)%n;
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
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 21;
        System.out.println(pairSum(list,target));
    }
    
}
