public class Recursion_Zig_zag_practice {
    public static void zigZag(int n){
        if(n==0)return;
        System.out.println("pre");
        zigZag(n-1);
        System.out.println("in");
        zigZag(n-1);
        System.out.println("Post");
    }
    public static void main(String[] args) {
        zigZag(3);
        
    }
}
