public class subset {
    public static void findsubset(String str, String ans, int i) {
        // base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return ;
        }

        // recursion
        
        // Yes
        findsubset(str, ans + str.charAt(i), i + 1);

        // No
        findsubset(str, ans, i + 1);
    }

    

    public static void main(String[] args) {
        String str = "abc";
        findsubset(str, "", 0);
    }
}
