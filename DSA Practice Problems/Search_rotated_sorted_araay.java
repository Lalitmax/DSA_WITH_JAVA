public class Search_rotated_sorted_araay {

    public static int search(int arr[], int si, int ei, int key) {
        // base case
        if (si > ei) {
            return -1;
        }
        // work
        int mid = si + (ei - si) / 2;
        if (arr[mid] == key) {
            return mid;
        }

        // case on L1
        if (arr[si] <= arr[mid]) {
            // case a left
            if (arr[si] <= key && arr[mid] >= key) {
                return search(arr, si, mid - 1, key);
            } else {
                // case b right
                return search(arr, mid + 1, ei, key);

            }
        } else {
            // on L1
            // case c
            if (arr[mid] <= key && arr[ei] >= key) {
                return search(arr, mid + 1, ei, key);
            } else {
                return search(arr, si, mid - 1, key);
            }
        }
    }

    public static void main(String args[]) {

        int arr[] = { 3, 4, 5, 6, 7, 0, 1, 2 };
        int f = search(arr, 0, arr.length - 1, 2);
        System.out.println(f);

    }

}
