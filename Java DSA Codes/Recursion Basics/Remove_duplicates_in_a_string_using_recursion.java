public class Remove_duplicates_in_a_string_using_recursion {

    public static void remDuplicate(String str,int indx, StringBuilder new_str, boolean map[]){
        // base case
        if(indx==str.length()){
            System.out.println(new_str);
            return;
        }
        // kaam
        char currchar = str.charAt(indx);
        if(map[currchar-'a']==true){
            remDuplicate(str,indx+1,new_str,map);
        }else{
            map[currchar-'a']=true;
            remDuplicate(str,indx+1,new_str.append(currchar),map);
        }
    }
    public static void main(String args[]){
    
        String str="apnacollege";
        remDuplicate(str,0,new StringBuilder(""), new boolean[26]);

    
    
    }
}
