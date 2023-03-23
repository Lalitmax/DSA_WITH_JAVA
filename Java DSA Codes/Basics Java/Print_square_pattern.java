import java.util.*;
public class Print_square_pattern {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n=sc.nextInt();
         
        //Print square pattern
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    
    
    }
}
