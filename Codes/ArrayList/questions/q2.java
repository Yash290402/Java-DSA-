import java.util.ArrayList;
import java.util.Collections;

public class q2 {
    public static ArrayList<Integer> findLonely(ArrayList<Integer> nums) {
        Collections.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        int size = nums.size();

        // Check if the list has only one element
        if (size == 1) {
            list.add(nums.get(0));
        } else if (size > 1) {

            // Check if the first number is lonely
            if (nums.get(0) + 1 < nums.get(1)) {
                list.add(nums.get(0));
            }

            // Check for lonely numbers in the middle of the list
            for (int i = 1; i < size - 1; i++) {
                if (nums.get(i - 1) + 1 < nums.get(i) && nums.get(i) + 1 < nums.get(i + 1)) {
                    list.add(nums.get(i));
                }
            }

            // Check if the last number is lonely
            if (nums.get(size - 2) + 1 < nums.get(size - 1)) {
                list.add(nums.get(size - 1));
            }
        }

        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(3);
        nums.add(5);
        nums.add(3);
       

        System.out.println(findLonely(nums));
    }
}
