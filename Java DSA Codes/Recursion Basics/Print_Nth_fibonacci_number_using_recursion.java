public class Print_Nth_fibonacci_number_using_recursion {
    public static int fib(int n){
        // base case
        if(n==0 || n==1){
            return n;
        }
        int f1=fib(n-1);
        int f2=fib(n-2);

        int ans = f1+f2;
        return ans;
    }
    public static void main(String args[]){
    
        System.out.println(fib(5));
    
    
    }
}
