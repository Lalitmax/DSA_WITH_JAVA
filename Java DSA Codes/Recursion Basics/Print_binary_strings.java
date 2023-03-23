public class Print_binary_strings {

    public static void printBinaryString(int n, int lastplace, String str){


        // base case
        if(n==0){
            System.out.println(str);
            return;
        }
        // work

        // if(lastplace==0){
        //     printBinaryString(n-1,0,str+"0");
        //     printBinaryString(n-1,1,str+"1");
        // }else{
        //     printBinaryString(n-1,0,str+"0");
        // }
        
        // Also write in one line
        printBinaryString(n-1, 0, str+"0");
        if(lastplace==0){
            printBinaryString(n-1, 1, str+"1");
        }

    }
    public static void main(String args[]){
    
        printBinaryString(3,0,"");
    
    
    }
}
