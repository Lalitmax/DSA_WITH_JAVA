public class Majority_element2_method3 {

    public static void main(String arhs[]) {
        int nums[] = {2,2,2,4,4,5,5,5};

        int nby3 = nums.length / 3;
        int cnt1 = 0;
        int cnt2 = 0;

        int a = 0;
        int b = 1;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (a == num) {
                cnt1++;
            } else if (b == num) {
                cnt2++;
            } else if (cnt1 == 0) {
                a = num;
                cnt1 = 1;
            } else if (cnt2 == 0) {
                b = num;
                cnt2 = 1;
            } else {
                cnt1--;
                cnt2--;
            }
        }

        cnt1 = 0;
        cnt2 = 0;

        for (int num : nums) {
            if (a == num) {
                cnt1++;
            }
            if (b == num) {
                cnt2++;
            }
        }

        if (cnt1 > nby3) {
            System.out.print(a);
        }

        if (cnt2 > nby3) {
            System.out.print(b);
        }

    }
}
