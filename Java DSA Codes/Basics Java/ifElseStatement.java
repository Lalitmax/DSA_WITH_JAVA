public class ifElseStatement{

    public static void main(String args[]){

        // check tey can vote
        int age = 23;
        if(age>18){
            System.out.println("Adult");
        } else{
            System.out.println("Not adult");
        }

        // check for teenager
        if(age>13 && age<18){
            System.out.println("Teenager");
        }else{
            System.out.println("Not adult");
        }
    }
}