import java.util.*;

public class Valid_anagram {
    public static void main(String[] args) {
        
     String s = "rat";
     String t = "car";

     if(s.length()!=t.length()){
         
         System.out.print("False");
        
     }

     HashMap<Character,Integer> hm  = new HashMap<>();

     for(int i=0;i<s.length(); i++){
        char ch = s.charAt(i);
        hm.put(ch,hm.getOrDefault(ch,0)+1);
     }
     int flag =0;
     for(int i=0; i<t.length(); i++){ // O(n)
        char ch = t.charAt(i);

        if(hm.get(ch)!=null){
            if(hm.get(ch)==1){
                hm.remove(ch);
            }else{
                hm.put(ch,hm.get(ch)-1);
            }
        }else{
            System.out.print("False");
            flag =1;
            break;
        }
     }



     if(hm.isEmpty()){
        System.out.print("true");
     }else{
        if(flag==0){
            System.out.print("False");
        }
     }

    }
}
