import java.util.ArrayList;

public class q1 {
    public static boolean isinx(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
             
            if (list.get(i) >list.get(i+1  ) ) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(5);
        System.out.println(isinx(list));
    }
}
