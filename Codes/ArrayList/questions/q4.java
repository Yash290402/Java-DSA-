import java.util.ArrayList;

public class q4 {
    public static ArrayList<Integer> beautifulArray(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(1);

        // Divide and conquer approach
        divideConquer(result, n);

        return result;
    }

    private static void divideConquer(ArrayList<Integer> nums, int n) {
        if (nums.size() == n) {
            return;
        }

        ArrayList<Integer> temp = new ArrayList<>();

        // Add odd numbers
        for (int num : nums) {
            if (2 * num - 1 <= n) {
                temp.add(2 * num - 1);
            }
        }

        // Add even numbers
        for (int num : nums) {
            if (2 * num <= n) {
                temp.add(2 * num);
            }
        }

        divideConquer(temp, n);

        // Merge the arrays
        nums.clear();
        nums.addAll(temp);
    }

    public static void main(String[] args) {
        
        System.out.println(beautifulArray(4)); // Output: [1, 3, 2, 4]
        System.out.println(beautifulArray(5)); // Output: [1, 3, 2, 5, 4]
    }
}
