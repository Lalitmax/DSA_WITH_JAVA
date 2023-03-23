public class Check_twice_value {
    public static boolean checktwice(int nums[]) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                
                    if (nums[i] == nums[j]) {
                        return true;
                    }
                
            }
        }
        return false;
    }

    public static void main(String args[]) {

        int nums[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        if (checktwice(nums)) {
            System.out.println("true");
        } else {
            System.out.println("false");

        }

    }

}
