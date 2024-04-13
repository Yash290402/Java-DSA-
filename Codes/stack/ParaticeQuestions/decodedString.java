import java.util.Stack;

// Note:-
// not attempt because of not understand the concept and code

public class decodedString {

    static String decode(String str) {
        Stack<Integer> integerStack = new Stack<>();
        Stack<Character> stringStack = new Stack<>();
        String temp = "", result = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            // If the character is a digit, parse the number
            if (Character.isDigit(str.charAt(i))) {
                while (Character.isDigit(str.charAt(i))) {
                    count = count * 10 + str.charAt(i) - '0';
                    i++;
                }
                i--; // Decrement to adjust for the extra increment in the loop
                integerStack.push(count);
            }
            // If the character is ']', decode the string
            else if (str.charAt(i) == ']') {
                temp = "";
                count = 0;

                // Get the count of repetitions from the integer stack
                if (!integerStack.isEmpty()) {
                    count = integerStack.peek();
                    integerStack.pop();
                }

                // Extract the string from the string stack until '['
                while (!stringStack.isEmpty() && stringStack.peek() != '[') {
                    temp = stringStack.peek() + temp;
                    stringStack.pop();
                }

                // Pop the '[' from the string stack
                if (!stringStack.empty() && stringStack.peek() == '[')
                    stringStack.pop();

                // Append the decoded string to result
                for (int j = 0; j < count; j++)
                    result = result + temp;

                // Push the decoded string back to the string stack
                for (int j = 0; j < result.length(); j++)
                    stringStack.push(result.charAt(j));
                result = ""; // Reset result for next iteration
            }

            // If the character is '[', handle appropriately
            else if (str.charAt(i) == '[') {
                if (Character.isDigit(str.charAt(i - 1)))
                    stringStack.push(str.charAt(i)); // If preceded by a digit, directly push
                else {
                    stringStack.push(str.charAt(i)); // Else push and also push a default count of 1 to integer stack
                    integerStack.push(1);
                }
            }

            // If the character is not a digit or '[', simply push to string stack
            else
                stringStack.push(str.charAt(i));
        }

        // Construct the decoded string from the string stack
        while (!stringStack.isEmpty()) {
            result = stringStack.peek() + result;
            stringStack.pop();
        }
        return result; // Return the decoded string
    }

    public static void main(String args[]) {
        String str = "3[b2[ca]]";
        System.out.println(decode(str));
    }
}
