public class Print_all_the_subsequences_of_a_string_using_recursion {

    public static void printSubstring(String str , int indx, String newString){


        // base case 
        if(indx==str.length()){
            System.out.println(newString);
            return;
        }


        // aa sakta hai
        char currchar=str.charAt(indx);
        printSubstring(str,indx+1, newString+(currchar));

        // nahi aa sakta hai
        printSubstring(str,indx+1,newString);
    }
    // Time Complexity
    //   O(2^n)
    public static void main(String args[]){
    
        String str="abc";
    printSubstring(str, 00, "");
    
    }
}
