public class FindSubset {
    public static void findSubset(String str, int i, String ans){
        // baae case
        if(str.length()==i){
            if(ans.length()==0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        //recursion
        findSubset(str,i+1,ans+str.charAt(i));
        findSubset(str,i+1,ans);

    }
    

    public static void main(String args[]){
        String str = "abc";
        findSubset(str,0,"");
    }

}
