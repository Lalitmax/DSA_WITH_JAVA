import java.util.HashSet;
public class Print_all_the_unique_subsequences_of_a_string_using_recursion {

    public static void printUniqueSubSequences(String str, int indx, String newString, HashSet<String> set){

        // base case
        if(indx==str.length()){

           if(set.contains(newString)){
            return;
           }else{
            System.out.println(newString);
            set.add(newString);
            return;
           }
        }

        // aa sakta hai
        char currchar=str.charAt(indx);
        printUniqueSubSequences(str,indx+1,newString+currchar,set);

        // nahi aa sakta hai
        printUniqueSubSequences(str,indx+1,newString,set);
    }

    public static void main(String args[]){
        String str="aaa";
        HashSet<String> set = new HashSet<>();
        printUniqueSubSequences(str, 0, "",set);
    
    }
}
