public class Reverse_string_using_recursion {

    public static void reverseStr(String str, StringBuilder sb, int i){

        if(i==0){
            System.out.println(sb.append(str.charAt(i)));
            return;
        }
        reverseStr(str, sb.append(str.charAt(i)),i-1);

    }
    
    public static void main(String args[]){
    
        String str="abcd";
        reverseStr(str, new StringBuilder(""),str.length()-1);
    
    
    }
}
