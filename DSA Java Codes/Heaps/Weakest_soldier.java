import java.util.PriorityQueue;

public class Weakest_soldier {
    public static class Row implements Comparable<Row>{
        int soldier;
        int idx;

        public Row(int soldier,int idx){
            this.soldier = soldier;
            this.idx = idx;
        }

        @Override
        public int compareTo(Row r2){
            if(this.soldier==r2.soldier){
                return this.idx-r2.idx;
            }else{
                return this.soldier - r2.soldier;
            }
        }
    }
     public static void main(String arg[]){
        int solAndCiv[][] = {{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}};
        int k=2;

        PriorityQueue<Row> pq = new PriorityQueue<>(); 
        for(int i=0; i<solAndCiv.length; i++){
            int cnt=0;
            for(int j=0; j<solAndCiv[0].length; j++){
                if(solAndCiv[i][j]==1){
                    cnt++;
                }
            }
            pq.add(new Row(cnt,i));


        }

        for(int i=0; i<k; i++){
            System.out.println("Row"+pq.remove().idx);
        }
      
        
    }
    
}
