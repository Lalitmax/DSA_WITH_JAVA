import java.util.HashMap;
public class Majority_element2_method1 {
    public static void main(String ar[]){
        // int nums[] = {1,3,2,5,1,3,1,5,1};
        int nums[] = {2,1};
        HashMap<Integer, Integer> hm = new  HashMap<>();
        int nBy3 = nums.length/3;
        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            if(hm.containsKey(num)){
                hm.put(num,hm.get(num)+1);
            }else{
                hm.put(num,1);
            }
        }

        for(int i=0; i<hm.size(); i++){
            if(hm.get(nums[i])>nBy3){
                System.out.print( nums[i]+" ");
            }
        }
    
    }
}
