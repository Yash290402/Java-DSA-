import java.io.*;
import java.util.*;

public class watertrapped {

    // Function to calculate the maximum water that can be trapped
    public static int maxWater(int[] height) {
        Stack<Integer> stack = new Stack<>(); // Stack to store indices of bars
        int n = height.length; // Length of the input array
        int ans = 0; // Variable to store the result

        // Loop through each bar in the input array
        for (int i = 0; i < n; i++) {
            // If the current bar is taller than the bar at the top of the stack
            while ((!stack.isEmpty()) && (height[stack.peek()] < height[i])) {
                int popHeight = height[stack.peek()]; // Height of the bar at the top of the stack
                stack.pop(); // Pop the index of the top bar from the stack

                // If the stack becomes empty, break the loop
                if (stack.isEmpty())
                    break;

                int distance = i - stack.peek() - 1; // Distance between the current bar and the bar at the top of the
                                                     // stack
                int minHeight = Math.min(height[stack.peek()], height[i]) - popHeight; // Minimum height of water
                                                                                       // between the bars
                ans += distance * minHeight; // Calculate the water trapped between the bars and add it to the result
            }
            stack.push(i); // Push the index of the current bar onto the stack
        }
        return ans; // Return the total water trapped
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }; // Input array
        System.out.print(maxWater(arr)); // Calculate and print the maximum water trapped
    }
}
