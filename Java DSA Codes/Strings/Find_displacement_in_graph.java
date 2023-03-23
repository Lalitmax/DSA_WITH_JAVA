public class Find_displacement_in_graph {
    public static float displacement(String path) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'N') {
                y++;
            } else if (path.charAt(i) == 'S') {
                y--;
            } else if (path.charAt(i) == 'E') {
                x++;
            } else {
                x--;
            }
        }
        int x2 = x * x;
        int y2 = y * y;

        float ans = (float) Math.sqrt(x2 + y2);
        return ans;
    }

    public static void main(String args[]) {

        String path = "WNEENESENNN";
        System.out.println(displacement(path));

    }
}