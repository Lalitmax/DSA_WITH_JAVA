public class  Function_overloading{

    // sum of a and b
    public static int  sum(int a, int b){
        return a+b;
    }
    // sum of a, and c
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    // sum float number a,b,c and d
    public static float sum(float a,float b,float c, float d){
        return a+b;
    }
    public static void main(String args[]){

        // int ans=sum(5,6);
        // int ans2=sum(5,6,7);
        int ans1=sum(4,5);
        int ans2 = sum(3,4,5);
        float ans3=sum(2.3f,4.5f,4.0f,1.1f);

        
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
       

        
    }
}