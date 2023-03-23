public class String_compression {
    public static String compress(String str) {
        StringBuilder sb = new StringBuilder("");

        for(int i=0; i<str.length(); i++){
            Integer cnt = 1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                cnt++;
                i++;
            }
            sb.append(str.charAt(i));
            if(cnt>1){
                sb.append(cnt.toString());
            }
        }

        return sb.toString();
    }
       
    

    public static void main(String args[]) {

        String str = "aaabbbcdeefffg";
        
        System.out.println(compress(str));

    }
}
