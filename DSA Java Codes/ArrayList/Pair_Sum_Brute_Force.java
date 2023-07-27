import java.util.ArrayList;

public class Pair_Sum_Brute_Force {
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        int cnt=0;
        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                int sum = list.get(i)+list.get(j);
                if(sum==target){
                    
                    System.out.println("("+i+","+j+")");
                    cnt++;
                    
                }

            }
        }
        if(cnt>0){
            return true;
        }else {
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
