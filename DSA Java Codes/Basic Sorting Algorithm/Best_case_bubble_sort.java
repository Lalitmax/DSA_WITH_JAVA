public class Best_case_bubble_sort {
    public static void main(String args[]) {

        int arr[] = { 3, 5, 6, 8, 9 }; // Best case if array is already sorted
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                    cnt++;
                }

            }
            if (swapped == false) {
                break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(cnt);
    }
}
