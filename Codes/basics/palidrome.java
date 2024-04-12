import java.sql.Array;
import java.util.Arrays;

public class palidrome {

    public static void pali(int[] n) {
    int[] temp = new int[n.length];
    int[] temp2 = new int[n.length];

    for (int i = 0; i < n.length; i++) {
    System.out.print(n[i]);
    temp[i] = n[i];
    }
    System.out.println();

    for (int j = n.length-1; j >= 0; j--) {
    System.out.print(temp[j]);
    temp2[n.length-1-j]=temp[j];
    }
    System.out.println();
    if(Arrays.equals(n,temp2 )){
    System.out.println("Number is palidrome");
    }
    else{
    System.out.println("Number is not palidrome");
    }

    }

    public static void main(String[] args) {
    int[] myNum = { 4, 7 };
    pali(myNum);
    }
}

    // chatgpt 


    // public static boolean isPalindrome(int[] n) {
    //     int left = 0;
    //     int right = n.length - 1;

    //     while (left < right) {
    //         if (n[left] != n[right]) {
    //             return false;
    //         }
    //         left++;
    //         right--;
    //     }
    //     return true;
    // }

    // public static void main(String[] args) {
    //     int[] myNum = { 4, 7 };
    //     System.out.print("Original Array: ");
    //     System.out.println(Arrays.toString(myNum));

    //     if (isPalindrome(myNum)) {
    //         System.out.println("Number is palindrome");
    //     } else {
    //         System.out.println("Number is not palindrome");
    //     }
    // }

