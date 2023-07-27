import java.util.ArrayList;
public class Monotonic_ArraList {
    public static boolean isMonotonic(ArrayList<Integer> list){
        int a=1;
        int b=1;
        for(int i=0; i<list.size()-1; i++){
            if(list.get(i)>=list.get(i+1)){
                a=0;
            }
            if(list.get(i)<=list.get(i+1)){
                b=0;
                
            }
        }
        if(a==0 && b==0){
            return false;
        }else{
            return true;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list  = new ArrayList<>();
        list.add(1);
        list.add(3);
        
        list.add(2);

        System.out.print(isMonotonic(list));
    }
    
}
