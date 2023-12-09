 import java.util.Scanner;
public class find_missing_and_repating_these_number {

    // Function to find and print two elements in an array where one element is repeating and the other is missing.
    static void printTwoElements(int[] arr, int n) {
        // Creating a temporary array of size n with initial values as 0.
        int[] temp = new int[n];

        // Variables to store repeating and missing numbers.
        int repeatingNumber = -1;
        int missingNumber = -1;

        // Loop through the array to count the occurrences of each element using the temp array.
        for (int i = 0; i < n; i++) {
            temp[arr[i] - 1]++;

            // If the count becomes more than 1, the current element is the repeating element.
            if (temp[arr[i] - 1] > 1) {
                repeatingNumber = arr[i];
            }
        }

        // Loop through the temp array to find the element with count 0, which is the missing element.
        for (int i = 0; i < n; i++) {
            if (temp[i] == 0) {
                missingNumber = i + 1;
                break;
            }
        }

        // Print the repeating and missing numbers.
        System.out.println(repeatingNumber + " " + missingNumber);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array.
        int n = scanner.nextInt();

        // Input the elements of the array.
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Call the function to find and print repeating and missing elements.
        printTwoElements(arr, n);

        scanner.close();
    }
}
