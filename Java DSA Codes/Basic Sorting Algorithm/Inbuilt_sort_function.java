import java.util.Arrays;
// Want to use all function then util.*;
import java.util.*;

public class Inbuilt_sort_function {
    public static void main(String args[]) {

        int arr[] = { 6, 3, 4, 2, 8, 1 };

        Arrays.sort(arr);
        // print array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println();

        int arr2[] = { 6, 3, 4, 2, 8, 1 };
        Arrays.sort(arr2, 0, 3);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        System.out.println();
        System.out.println();

        // for descending
        // if you want to use reverse function plz make int to Integer

        Integer arr3[] = { 6, 3, 4, 2, 8, 1 };

        Arrays.sort(arr3, Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr3[i] + " ");
        }

        System.out.println();
        System.out.println();

        Integer arr4[] = { 6, 3, 4, 2, 8, 1 };
        Arrays.sort(arr4, 0, 5, Collections.reverseOrder());

        for (int i = 0; i < arr4.length; i++) {
            System.out.print(arr4[i] + " ");
        }

    }
}
