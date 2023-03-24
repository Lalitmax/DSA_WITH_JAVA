public class Majority_of_element_in_array_recursively {
    public static int countRange(int nums[], int num, int si, int ei) {
        int count = 0;
        for (int i = si; i <= ei; i++) {
            if (nums[i] == num) {
                count++;
            }
        }

        return count;
    }

    public static int majorityElementRec(int nums[], int si, int ei) {
        if (si == ei) {
            return nums[si];
        }

        int mid = si + (ei - si) / 2;

        int left = majorityElementRec(nums, si, mid);
        int right = majorityElementRec(nums, mid + 1, ei);

        if (left == right) {
            return left;
        }

        // otherwise, count each element and return the "winner"
        int leftCount = countRange(nums, left, si, ei);
        int rightCount = countRange(nums, right, si, ei);

        int max;
        max = leftCount > rightCount ? left : right;
        return max;
    }

    public static void main(String args[]){
    
        int nums[] = {2,2,1,1,1,2,2};
        System.out.println(majorityElementRec(nums,0,nums.length-1));
    
    
    }
}
