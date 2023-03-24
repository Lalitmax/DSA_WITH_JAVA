public class Majority_of_element_in_array_recursively_brute_force_approach {
    public static int majority(int arr[]) {
        int majorityele = arr.length / 2;

        // finding majoruty
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            cnt = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                }
            }
            if (cnt > majorityele) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String args[]) {

        int nums[] = { 2, 2, 1, 1, 1, 1, 1, 2, 2 };
        int ans = majority(nums);
        System.out.print(ans);

    }
}
