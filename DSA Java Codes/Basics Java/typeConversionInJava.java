public class typeConversionInJava {
    public static void main(String ar[]){
        int i=88;
        float f=i;
        System.out.println(f);

//        int i=f; gives error because f is float

        int i1=45;
        long l=i1;
        System.out.println(l);
        long l1=56;
//        int i2=l1;  not convert because l1 big as compare int
        // etc

    }
}
