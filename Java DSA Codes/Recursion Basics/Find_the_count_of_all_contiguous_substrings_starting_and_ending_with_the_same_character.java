public class Find_the_count_of_all_contiguous_substrings_starting_and_ending_with_the_same_character {

    public static int countStr(String str, int i,int j,int n){

        // when str length is 1
        if(n==1){
            return 1;
        }
        // for result conditicon 
        if(n<=0){
            return 0;
        }
        // A + B Intersection A And B
        int result = countStr(str, i+1, j, n-1)+countStr(str, i, j-1, n-1)-countStr(str, i+1, j-1, n-2);

        if(str.charAt(i)==str.charAt(j)){
            result++;
        }
        return result;

    }
    public static void main(String args[]){
         String str ="abcab";
         int n = str.length();
        System.out.println(countStr(str, 0, n-1, n));

    
    
    }
}
