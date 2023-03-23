import java.util.*;
public class String_concatenate {
    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String args[]){
    
        String firstName = "Lalit";
        String lastName = "yadav";
        String  fullName = firstName+" "+lastName;
        // System.out.println(fullName);
        printLetters(fullName);
    
    
    }
}
