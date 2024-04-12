import java.util.*;

public class validparentheses {

    public static boolean isvalid(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // opening
            if (c == '(' || c == '{' || c == '[') {

                s.push(c);

            } else {

                // closing
                if (s.isEmpty()) {
                    return false;
                }
                if ((s.peek() == '(' && c == ')') || (s.peek() == '{' && c == '}') || (s.peek() == '[' && c == ']')) {
                    s.pop();
                } else {
                    return false;
                }
            }

        }
        if (s.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String str = "({}))";
        System.out.println(isvalid(str));
    }
}
