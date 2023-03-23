public class Check_if_a_number_is_power_of_two_or_not {

    public static boolean isPowerOfTwo(int n) {
        if ((n & (n - 1)) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {

        System.out.println(isPowerOfTwo(32));

    }
}
