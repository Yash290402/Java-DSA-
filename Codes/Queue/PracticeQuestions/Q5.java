package PracticeQuestions;

import java.util.Deque;
import java.util.LinkedList;


// dont understand logic behind the question ,i will solve this later on

public class Q5 {
    static void printMax(int arr[], int n, int k) {
        Deque<Integer> Qi = new LinkedList<Integer>();

        // Processing the first window
        for (int i = 0; i < k; ++i) {
            while (!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()]) {
                Qi.removeLast();
            }
            Qi.addLast(i);
        }

        // Processing subsequent windows
        for (int i = k; i < n; ++i) {
            System.out.print(arr[Qi.peek()] + " ");

            while ((!Qi.isEmpty()) && Qi.peek() <= i - k) {
                Qi.removeFirst();
            }
            while ((!Qi.isEmpty()) && arr[i] >= arr[Qi.peekLast()]) {
                Qi.removeLast();
            }
            Qi.addLast(i);
        }

        // Printing the last maximum
        System.out.print(arr[Qi.peek()]);
    }

    public static void main(String[] args) {
        int arr[] = { 1,2,3,1,4,5,2,3,6 };
        int k = 3;
        printMax(arr, arr.length, k);
    }
}
