public class Majority_element1 {
    public static void main(String args[]){
        int nums[] = {1,1,2,3,1,3,1,4,1};

        int nBy2 = nums.length/2;

        int cnt=0;
        int element=0;

        for(int i=0; i<nums.length; i++){
            if(cnt==0){
                element = nums[i];
            }

            if(element==nums[i]){
                cnt++;
            }else{
                cnt--; 
            }
        }

        System.out.print(element);


    }
}
