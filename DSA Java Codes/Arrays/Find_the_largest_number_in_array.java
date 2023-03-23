public class Find_the_largest_number_in_array {

    public static int findLargest(int arr[]) {
        int largest = Integer.MIN_VALUE;
        System.out.println(largest);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }

        }
        return largest;
    }

    public static void main(String args[]) {

        int arr[] = { 4, 2, 6, 5, 99, 77, 848 };

        System.out.println("The largest number is " + findLargest(arr));

    }
}
