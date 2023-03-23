public class Lenear_search_string {

    public static int lenearSearch(String fruits[],String key){
        // search
        for(int i=0; i<fruits.length; i++){
            if(fruits[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
    
        String fruits[]={"apple","mango","orange","banana","coconut"};
        String key = "coconut";

        int index=lenearSearch(fruits, key);
        if(index==-1){
            System.out.println("Not found");
        } else{
            System.out.println("The key is present at the index of "+index);
        }
    
    
    }
}
