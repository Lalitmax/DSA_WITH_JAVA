import java.util.*;
public class Spiral_print {
    public static void shortestPath(String str) {
        int y=0,x=0;
      
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='W'){
                x--;
            }else if(str.charAt(i)=='N'){
                y++;
            } else if(str.charAt(i)=='E'){
                x++;
            }else{
                y--;
            }
        }

        int x1=x*x;
        int y1 = y*y;

        int x1plusy1=x1+y1;

        double d = Math.sqrt(x1plusy1);
        System.out.println(d);

     
    }

    public static void main(String args[]) {
       String fruits[]={"apple","mango","banana"};

       String largest = fruits[0];
       for(int i=1; i<fruits.length; i++){
        if(largest.compareTo(fruits[i])<0){
            largest=fruits[i];
        }
       }

       System.out.println(largest);

    }
}
