import java.util.*;
public class Solid_rhombus_pattern {
    public static void main(String args[]){
    
        Scanner ss = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=ss.nextInt();

        // outer loop
        for(int i=1; i<=n; i++){
            // inner loop

            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
                
            }

            for(int k=1; k<=n; k++){
                System.out.print("*");
            }

            System.out.println();
        }
    
    
    }
}
