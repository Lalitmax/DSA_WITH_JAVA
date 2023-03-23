public class Find_first_and_last_occurrence_of_element_using_recursion {

    public static int fisrt=-1;
    public static int last = -1;

    public static void findOccurrence(String str, int indx, int key){

        // base case 
        if(indx==str.length()){
          System.out.print("last occurrence index --> "+last);
          return;
        }

        char currChar = str.charAt(indx);
        if(currChar==key){
            last = indx;
        }
        findOccurrence(str,indx+1,key);
    }
    public static void main(String args[]){
        String str="abaacdaefaah";
        char key='a';
        findOccurrence(str,0,key);
    
    
    }
}
