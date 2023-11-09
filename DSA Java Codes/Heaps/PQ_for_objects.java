import java.util.PriorityQueue;
import java.util.Comparator;

public class PQ_for_objects {

   public static class Student implements Comparable<Student>{ // overriding
      String name;
      int rank;

      public Student(String name, int rank){
         this.name = name;
         this.rank = rank;

      }

      @Override
      public int compareTo(Student s2){
         return this.rank -s2.rank;
      }
   }
   
   public static void main(String[] args) {
      PriorityQueue<Student> pq = new PriorityQueue<>();
      // for reverse order peeking
      // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

      pq.add(new Student("A",2));
      pq.add(new Student("B",12));
      pq.add(new Student("C",4)); 
      pq.add(new Student("D",8));
      pq.add(new Student("E",1));

      while(!pq.isEmpty()){
         System.out.println(pq.peek().name +"->"+pq.peek().rank);
         pq.remove();
      }
   }
   
}
