import java.util.Arrays;

public class Check_weather_two_strings_are_anagram {
    public static boolean isAnagram(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        if (len1 == len2) {
            int cnt = 0;
            for (int i = 0; i < len1; i++) {
                for (int j = 0; j < len2; j++) {
                    if (str1.charAt(i) == str2.charAt(j)) {
                        cnt++;
                    }
                }
            }
            if (cnt == len1) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }

    }

    public static void main(String args[]) {

        String str1 = "abcd";
        String str2 = "bcda";
        // System.out.println(isAnagram(str1, str2));
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.length() == str2.length()) {
            char[] str1chararray = str1.toCharArray();
            char[] str2chararray = str2.toCharArray();

            Arrays.sort(str1chararray);
            Arrays.sort(str2chararray);
            boolean result = Arrays.equals(str1chararray, str2chararray);

            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagrams of each other.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
            }
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");

        }

    }
}