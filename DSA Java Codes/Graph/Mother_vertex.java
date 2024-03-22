class Mother_vertex
{
    
    //Function to find a Mother Vertex in the Graph.

    // *********> A Mother Vertex is a vertex through which we can reach all the other vertices of the Graph.
     
    public static void dfs(ArrayList<ArrayList<Integer>>adj,int curr, boolean vis[]){
        
        vis[curr] = true;
        
        
        for(int i=0; i<adj.get(curr).size(); i++){
            
            int dest = adj.get(curr).get(i);
            
            if(!vis[dest]){
                dfs(adj,dest,vis);
            }
        }
        
        
    }
    public int findMotherVertex(int V, ArrayList<ArrayList<Integer>>adj)
    {
        
        
        int ans=0;
        boolean vis[] = new boolean[V];
        
        int lastNode=0;
        
        for(int i=0; i<V; i++){
            
            if(!vis[i]){
                
                dfs(adj,i,vis);
                lastNode=i;
                
            }
        }
        
        
        vis= new boolean[V];
        
        dfs(adj,lastNode,vis);
        
        for(boolean flag : vis){
            if(flag==false){
                return -1;
            }
        }
        
        return lastNode;
        
         
    }
}