package Practice_Questions;

public class kth_largestodd {
    // Method to find the Kth largest odd number in a given range
    public static int kthOdd(int[] range, int K) {
        // Check if K is less than or equal to 0
        if (K <= 0)
            return 0; // Return 0 if K is invalid

        // Extract lower and upper bounds from the range array
        int L = range[0];
        int R = range[1];

        // Check if the last digit of R is odd
        if ((R & 1) > 0) {
            // If R is odd, calculate the count of odd numbers in the range
            int Count = (int) Math.ceil((R - L + 1) / 2);

            // Check if K exceeds the count of odd numbers in the range
            if (K > Count)
                return 0; // If K exceeds count, return 0

            // Calculate and return the Kth odd number using the formula
            return (R - 2 * K + 2);
        } else {
            // If R is even, calculate the count of odd numbers in the range
            int Count = (R - L + 1) / 2;

            // Check if K exceeds the count of odd numbers in the range
            if (K > Count)
                return 0; // If K exceeds count, return 0

            // Calculate and return the Kth odd number using the formula
            return (R - 2 * K + 1);
        }
    }

    // Main method to test the kthOdd function
    public static void main(String args[]) {
        int[] p = { -3, 3 }; // Range from -10 to 10
        int k = 1; // Find the 8th largest odd number in the range
        System.out.println(kthOdd(p, k)); // Print the result
    }
}
