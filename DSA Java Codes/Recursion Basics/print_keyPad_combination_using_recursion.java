public class print_keyPad_combination_using_recursion {
    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vws", "yz" };

    public static void printComb(String str, int indx, String combination) {
        // base case
        if (indx == str.length()) {
            System.out.println(combination);
            return;
        }

        // work
        char currChar = str.charAt(indx);
        String mapping = keypad[currChar - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            printComb(str, indx + 1, combination + mapping.charAt(i));
        }
    }

    // Time Complexity
    // O(4^n)

    public static void main(String args[]) {

        String str = "234";
        printComb(str, 0, "");

    }
}
