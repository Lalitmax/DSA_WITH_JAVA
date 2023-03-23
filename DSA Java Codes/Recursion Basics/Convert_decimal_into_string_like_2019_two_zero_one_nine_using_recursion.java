public class Convert_decimal_into_string_like_2019_two_zero_one_nine_using_recursion {
    public static void convertIntoStr(int n) {

        if (n == 0) {
            return;
        }
        int lastDigit = n % 10;
        n = n / 10;
        convertIntoStr(n);

        switch (lastDigit) {
            case 0:
                System.out.print("Zero ");
                break;
            case 1:
                System.out.print("One ");
                break;
            case 2:
                System.out.print("Two ");
                break;
            case 3:
                System.out.print("Three ");
                break;
            case 4:
                System.out.print("Four ");
                break;
            case 5:
                System.out.print("Five ");
                break;
            case 6:
                System.out.print("Six ");
                break;
            case 7:
                System.out.print("Seven ");
                break;
            case 8:
                System.out.print("Eight ");
                break;
            case 9:
                System.out.print("Nine ");

        }

    }

    public static void main(String args[]) {
        convertIntoStr(1947);

    }
}
