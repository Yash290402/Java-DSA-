// Given a number N.The task is to generate and print all binary numbers with decimal values from 1 to N.
package PracticeQuestions;

import java.util.LinkedList;
import java.util.Queue;

public class Q1 {
    public static void generateBinary(int n) {
        if (n <= 0) {
            System.out.println("Invalid input.");
            return;
        }
        
        Queue<String> q = new LinkedList<String>();
        q.add("1");

        for (int i = 1; i <= n; i++) {
            String s1 = q.peek();
            q.remove();
            System.out.println(s1);
            
            String s2 = s1 + "0";
            String s3 = s1 + "1";
            q.add(s2);
            q.add(s3);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        generateBinary(n);
    }
}

