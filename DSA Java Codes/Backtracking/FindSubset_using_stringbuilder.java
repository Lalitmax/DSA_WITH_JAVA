public class FindSubset_using_stringbuilder {
    public static void findSubset(String str, int i, StringBuilder sb){
        // baae case
        if(str.length()==i){
            if(sb.length()==0){
                System.out.println("null");
            }else{
                System.out.println(sb);
            }
            
            return;
        }
        //recursion
        
        findSubset(str,i+1,sb.append(str.charAt(i)));
        sb.deleteCharAt(sb.length() - 1);
        findSubset(str,i+1,sb);

        
      

    }
    

    public static void main(String args[]){
        String str = "abc";
        findSubset(str,0,new StringBuilder(""));
    }

    
}
