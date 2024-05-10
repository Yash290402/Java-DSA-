
package Practice_Questions;

import java.util.*;

// Maximum Balanced String Partitions

public class count_maxSubstring {

    public static int count_String(String str, int n) {
        if (n == 0) {
            return 0;
        }

        int r = 0, l = 0;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == 'R') {
                r++;
            } else if (str.charAt(i) == 'L') {
                l++;
            }

            if (r == l) {
                ans++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        String str = "LRRRRLLRLLRL";
        int n = str.length();

        int ans = count_String(str, n);
        System.out.println("count of substring is " + ans);
    }
}
