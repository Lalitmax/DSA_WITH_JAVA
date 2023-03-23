public class Substring {
    public static String substring(String str, int si, int ei) {
        String newstr = "";
        for (int i = si; i < ei; i++) {
            newstr += str.charAt(i);
        }
        return newstr;
    }

    public static void main(String args[]) {

        String str = "helloWorld";
        // System.out.println(substring(str,0,5));

        // inbuilt function
        String answer = str.substring(0, 5);
        System.out.println(answer);

    }
}
