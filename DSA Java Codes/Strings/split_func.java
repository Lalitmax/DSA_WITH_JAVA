public class split_func {
    
    public static void main(String[] args) {
        // String str = "Lait  Max";
        // String[] strArr = str.split(" ");

        // for(String s : strArr){
        //     System.out.print(s);
        // }

        String str = "geekss@for@geekss";
        String[] strArr = str.split("@",-2); // for all as possible

        for(String s : strArr){
            System.out.print(s);
        }

    }
}
