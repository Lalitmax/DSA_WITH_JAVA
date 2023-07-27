import java.util.ArrayList;

public class Multi_Dimensional_ArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> m_list = new ArrayList<>();

        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);

        // ArrayList<Integer> list2 = new ArrayList<>();
        // list2.add(6);
        // list2.add(7);
        // list2.add(8);
        // list2.add(9);
        // list2.add(10);

        // m_list.add(list);
        // m_list.add(list2);
        // System.out.println(m_list)

        for(int i=1; i<=3; i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=1; j<=5; j++){
                list.add(j*i);

            }
            m_list.add(list);
        }

        for(int i=0; i<m_list.size(); i++){
            ArrayList<Integer> currList = m_list.get(i);
            for(int j=0; j<currList.size(); j++){
                
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
    }

}
