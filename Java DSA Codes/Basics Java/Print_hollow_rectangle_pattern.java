import java.util.*;
public class Print_hollow_rectangle_pattern {
    public static void main(String args[]){
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();

        // outer loop
        for(int i=1; i<=n; i++){
            // inner loop
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1|| j==n){
                    System.out.print("*"+" ");
                }else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
    
    
    }
}
