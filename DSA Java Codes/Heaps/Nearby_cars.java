import java.util.*;
public class Nearby_cars {
    public static class Point implements Comparable<Point>  {
        int x;
        int y;
        int sQuare;
        int idx;

        public Point(int x, int y, int sQuare, int idx){
            this.x =x;
            this.y = y;
            this.sQuare=sQuare;
            this.idx = idx;
        }

        @Override
        public int compareTo(Point p2){
            return this.sQuare-p2.sQuare;
        }
    }

    public static void main(String arg[]){
        int pts[][]={{3,3},{5,-1},{-2,4}};
        int k=2;
        PriorityQueue<Point> pq = new PriorityQueue<>();
        for(int i=0; i<pts.length; i++){
            int distanceSquare = pts[i][0]*pts[i][0]+pts[i][1]*pts[i][1];

            pq.add(new Point(pts[i][0],pts[i][1],distanceSquare,i));

        }

        for(int i=0; i<k; i++){
            System.out.println("C"+pq.remove().idx);
        }
    }
}
