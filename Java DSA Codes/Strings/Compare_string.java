public class Compare_string {
    public static void main(String args[]) {

        String s1 = "max";
        String s2 = "max";

        String s3 = new String("max");

        if (s1 == s2) {
            System.out.println("Strigns are equal");
        } else {
            System.out.println("Strigns are not equal");
        }

        if (s1 == s3) {
            System.out.println("Strigns are equal");
        } else {
            System.out.println("Strigns are not equal");
        }

        // check value only equal or not
        if (s1.equals(s3)) {
            System.out.println("Strigns are equal");
        } else {
            System.out.println("Strigns are not equal");
        }

    }
}
