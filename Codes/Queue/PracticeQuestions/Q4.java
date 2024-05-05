package PracticeQuestions;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

// Reversing the first K elements of a Queue
// We have an integer k and a queue of integers,we need to reverse the order of the first k elements of the queue, leaving the other elements in the same relative order.

public class Q4 {

    public static void reverse(Deque<Integer> q, int k) {
        Stack<Integer> s = new Stack<>();
        int size = q.size();

        for (int i = 0; i < k; i++) {
            s.push(q.removeFirst());

        }

        while (!s.isEmpty()) {
            q.addLast(s.pop());

        }

        for (int i = 0; i < size / 2; i++) {
            q.addLast(q.removeFirst());
        }

    }

    public static void printQueue(Deque<Integer> q) {
        System.out.print("Q = [");
        for (Integer num : q) {
            System.out.print(num + ", ");
        }
        System.out.println("\b\b]");
    }

    public static void main(String[] args) {
        Deque<Integer> q = new LinkedList<>();

        int k = 5;

        q.addLast(10);
        q.addLast(20);
        q.addLast(30);
        q.addLast(40);
        q.addLast(50);
        q.addLast(60);
        q.addLast(70);
        q.addLast(80);
        q.addLast(90);
        q.addLast(100);

        System.out.println("Before reversal:");
        printQueue(q);

        // Reverse the first k elements
        reverse(q, k);

        System.out.println("After reversal:");
        printQueue(q);

    }
}
