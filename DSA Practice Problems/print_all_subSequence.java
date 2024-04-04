  class print_all_subSequence {
    public static void printSub(String str,String tempStr, int i){
      if(i==str.length()){
        System.out.println(tempStr);

        return;
      }

      printSub(str,tempStr+str.charAt(i) ,i+1);
      printSub(str,tempStr ,i+1);

    }
    public static void main(String args[]){
    
      String str ="abc";
      printSub(str, ".", 0);
    }

}
