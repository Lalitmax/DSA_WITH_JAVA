public class Question_print_sevens_num_two_d_array {

    public static int countNum(int nums[][],int key){
        int count=0;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[0].length; j++){
                if(nums[i][j]==key){
                    count++;
                }
            }
        }
        return count;
    }


    public static void main(String args[]){
    
        int nums[][] = {{4,7,8},
                        {8,8,7}};
        int key =7;

        System.out.println(countNum(nums,key));
    
    
    }
}
