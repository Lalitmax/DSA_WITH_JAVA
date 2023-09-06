public class kth_smallest_element {
   public static void main(String[] args) {
     int[][] matrix = {{1,5,9},{10,11,13},{12,13,15}};

     int ans =0;
     int n=3;
     int m=3;
     int j=0;
     int cnt=1;
     int k=3;
     int i=0;
      for(i=0; cnt<k-1; i++){
         ans = matrix[j][i];
         
         
         if(i==m-1){
           
             j++;
             i=0;
            
         }
         cnt++;

     }

     System.out.println(ans);
     System.out.println(j);
     System.out.println(i);
   }
   
}
