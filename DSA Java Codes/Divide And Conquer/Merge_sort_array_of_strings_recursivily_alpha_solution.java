public class Merge_sort_array_of_strings_recursivily_alpha_solution {
    public static String[] mergeSort(String[] arr, int si, int ei) {
        // base case
        if (si == ei) {
            String[] A = { arr[si] };
            return A;
        }
        // work
        int mid = si + (ei - si) / 2;
        String[] arr1 = mergeSort(arr, si, mid);
        String[] arr2 = mergeSort(arr, mid + 1, ei);

        String[] arr3 = merge(arr1, arr2);
        return arr3;
    }

    static String[] merge(String[] arr1, String[] arr2) {
        int m = arr1.length;
        int n = arr2.length;

        String[] arr3 = new String[m + n];

        int idx = 0;
        int i = 0;
        int j = 0;

        while (i < m && j < n) {
            if (isSmaller(arr1[i], arr2[j])) {
                arr3[idx++] = arr1[i];
            } else {
                arr3[idx++] = arr2[j++];
            }

        }

        // left bacha hua
        while (i < m) {
            arr3[idx++] = arr1[i++];
        }

        // right bacha hua part
        while (j < n) {
            arr3[idx++] = arr2[j++];
        }

        return arr3;
    }

    public static boolean isSmaller(String str1, String str2) {
        if (str1.compareTo(str2) < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {

        String[] arr = { "sun", "earth", "mars", "mercury" };
        String[] a = mergeSort(arr, 0, arr.length -1);

    }
}
