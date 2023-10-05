public  class print_permutaion {

   public static void permute(char[] data, int i, int length) {
       if (i == length) {
           System.out.println(new String(data));
       } else {
           for (int j = i; j < length; j++) {
               swap(data, i, j);
               permute(data, i + 1, length);
               swap(data, i, j); // backtrack
           }
       }
   }

   public static void swap(char[] data, int i, int j) {
       char temp = data[i];
       data[i] = data[j];
       data[j] = temp;
   }

   public static void printPermutations(int number) {
       String numStr = String.valueOf(number);
       char[] data = numStr.toCharArray();
       int n = data.length;
       permute(data, 0, n);
   }

   public static void main(String[] args) {
       int number = 123;
       printPermutations(number);
   }
}
