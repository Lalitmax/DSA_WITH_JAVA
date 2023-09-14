import java.util.*;
import java.util.ArrayList;
public class Job_sequencing_problem {

   static class Job{
      int profit;
      int deadline;
      int id;

      public Job(int i, int d, int p){
         profit = p;
         deadline  = d;
         id = i;
      }
   }
   public static void main(String[] args) {
      int jobInfo[][] = {{4,20},{1,10},{1,40},{1,30}};
,                                                  
      ArrayList<Job> jobs = new ArrayList<>();

      for(int i=0; i<jobInfo.length; i++){
         jobs.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));

      }

      // Collections.sort(jobs, (a,b)-> a.profit - b.profit); // ascending order
      Collections.sort(jobs,(obj1,obj2) -> obj2.profit - obj1.profit); // Descending order

      ArrayList<Integer> seqs = new ArrayList<>();
      int time=0;

      for(int i=0; i<jobs.size(); i++){
         Job curr = jobs.get(i);
         if(curr.deadline>time){
            time++;
            seqs.add(curr.id);
         }
      }

      System.out.println("Max jobs = "+seqs.size());
      for(int i=0 ; i<seqs.size(); i++){
         System.out.print(seqs.get(i)+" ");
      }





   }
}
