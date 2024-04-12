
//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

import java.util.Scanner;

public class pra1 {
    public static boolean checkarray(int num[]) {

        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] == num[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int num[] = new int[7];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println(checkarray(num));
    }
}
