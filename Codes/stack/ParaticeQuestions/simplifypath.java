import java.io.*;
import java.util.*;

public class simplifypath {

    public static void main(String[] args) {
        String str = "/a/./b/../../c/";
        String res = simplify(str);
        System.out.println(res);
    }

    static String simplify(String A) {
        Stack<String> st = new Stack<String>();
        String res = "";
        res += "/"; // Initialize result with root directory

        int len_A = A.length();
        for (int i = 0; i < len_A; i++) {
            String dir = "";

            // Skip consecutive slashes
            while (i < len_A && A.charAt(i) == '/')
                i++;

            // Extract directory name
            while (i < len_A && A.charAt(i) != '/') {
                dir += A.charAt(i);
                i++;
            }
            // If encountered "..", go back one directory
            if (dir.equals("..") == true) {
                if (!st.empty())
                    st.pop(); // Pop the top directory from the stack
            }
            // If encountered ".", ignore
            else if (dir.equals(".") == true)
                continue;
                
            // If encountered a valid directory name, push it onto the stack
            else if (dir.length() != 0)
                st.push(dir);
        }

        // Reverse the stack to get the simplified absolute path
        Stack<String> st1 = new Stack<String>();
        while (!st.empty()) {
            st1.push(st.pop());
        }

        // Reconstruct the simplified path from the stack
        while (!st1.empty()) {
            if (st1.size() != 1)
                res += (st1.pop() + "/"); // If not the last directory, add "/"
            else
                res += st1.pop(); // If the last directory, don't add "/"
        }

        return res; // Return the simplified absolute path
    }
}
