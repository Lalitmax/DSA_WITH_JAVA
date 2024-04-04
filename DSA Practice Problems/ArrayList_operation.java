import java.util.*;

public class ArrayList_operation {
    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> al = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        ans.add(al);

        System.out.println(ans);
        al.removeLast();
        System.out.println(ans);

    }
}
