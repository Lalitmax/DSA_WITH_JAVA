public class Clear_range_of_bits {
    public static int clearRangeInBits(int n, int i, int j) {
        int a = ((~0) <<(j+1));
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static void main(String args[]){
    
        System.out.println(clearRangeInBits(10, 2, 4));
    
    
    }
}
