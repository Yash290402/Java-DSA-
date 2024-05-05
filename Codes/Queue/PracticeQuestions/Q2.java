// Given are N ropes of different lengths,the task is to connect these ropes into one rope with minimum cost, such that the cost to connect two ropes is equal to the sum of their lengths.
// In this we use Priority Queue
package PracticeQuestions;

import java.util.PriorityQueue;

public class Q2 {

    static int minCost(int arr[], int n) {
        // Create a priority queue to store rope lengths
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add all rope lengths to the priority queue
        for (int i = 0; i < n; i++) {
            pq.add(arr[i]);
        }

        int res = 0; // Initialize result

        // Continue until there's only one rope left
        while (pq.size() > 1) {
            // Remove the two shortest ropes
            int first = pq.poll();
            System.out.println(first);
            int second = pq.poll();
            System.out.println(second);

            // Calculate the cost of connecting these two ropes
            int cost = first + second;

            // Add the cost to the result
            res += cost;
            System.out.println(res);

            // Add the combined rope back to the priority queue
            pq.add(cost);
        }

        // Return the total minimum cost
        return res;
    }

    public static void main(String[] args) {
        int len[] = { 4, 3, 2, 6 };
        int size = len.length;
        System.out.println("Total cost for connecting ropes is " + minCost(len, size));
    }
}
