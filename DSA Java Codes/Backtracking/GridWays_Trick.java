public class GridWays_Trick {
    public static int fact(int n){
        // recursion
        if(n==1){
            return 1;
        }
       return  n*fact(n-1);
        

    }
    public static void main(String args[]){
        int n=3,m=3;
        int ans = (int)(fact(n-1 + m-1)) / 
                  (int) (fact(n-1)*fact(m-1));
    
        System.out.print(ans);
        
    }
}
