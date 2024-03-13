public class Disjoint_set{
    
  

    public static class DisjointSet{
        
          static int par[];
    
          static int rank[];
        
        public DisjointSet(int n){
            par = new int[n];
            rank = new int[n];
            
            for(int i=0; i<n; i++){
                par[i] = i;
            }
        }
          
        static int find(int x){
            if(x==par[x]){
                return x;
            }
            // path compression
            return par[x]=find(par[x]);
        }
    
        public void union(int x, int y){
        
            int parA = find(x);
            int parB = find(y);
        
        
            if(parB==parA)return;
        
            if(rank[parA]<rank[parB]){
                par[parA] = parB;
            }else if(rank[parA]>rank[parB]){
                par[parB] = parA;
            }else{
                par[parB]=parA;
            
                rank[parA]++;
            }
        }
        
    }
    
    
    
	public static void main(String[] args) {
	    
	    DisjointSet ds = new DisjointSet(7);
	      System.out.println(ds.find(3));
	    ds.union(1,3);
	    System.out.println(ds.find(3));
	    ds.union(2,4);
	    ds.union(3,6);
	    ds.union(1,4);
	    System.out.println(ds.find(3));
	    System.out.println(ds.find(4));
	    
	    ds.union(1,5);
	    
	    
	    
		 
	}
}