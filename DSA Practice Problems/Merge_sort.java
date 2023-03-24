public class Merge_sort {
    public static void mergeSort(int arr[], int si, int ei) {

        // base case
        if (si >= ei) {
            return;
        }
        // work
        int mid = si + (ei - si) / 2;
        // left part
        mergeSort(arr, si, mid);
        // right part
        mergeSort(arr, mid + 1, ei);

        // merge
        merge(arr, si, mid, ei);

    }

    public static void merge(int arr[], int si, int mid, int ei) {
        // left part (0,3) = 4 right part (4,6)= 3 -> 6-0+1=7
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1; // because if [1,2] si = 0, endindex = 0 so mid +1
        int k = 0;

        // left + rigt part
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // left part jo bacha hai
        while (i <= mid) {
            temp[k++] = arr[i++];

        }

        // lright part jo bacha hai
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy temp to original arr

        for (k = 0, i = si; k < temp.length;) {
            arr[i++] = temp[k++];
        }

    }

    public static void main(String args[]) {

        int arr[] = { 4, 2, 6, 1, 9, 3 };
        mergeSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}