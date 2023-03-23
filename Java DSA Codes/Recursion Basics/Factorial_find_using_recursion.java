public class Factorial_find_using_recursion {

    // we can also return these type
    public static int fact2(int n){

        if(n==0){
            return 1;
        }else {

            return n*fact2(n-1);
        }

        
    }
    public static int fact1(int n){

        if(n==0){
            return 1;
        }

        int fnm1 = fact1(n-1);
        int fn = n*fnm1;
        return fn;


    }
    public static void main(String args[]){
        System.out.println(fact1(5));
        
    
    
    }
}
