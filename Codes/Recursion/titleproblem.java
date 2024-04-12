public class titleproblem {
    public static int titling(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        // for vertical
        int vertical = titling(n - 1);

        // for horizontal
        int horizontal = titling(n - 2);
        return vertical + horizontal;
    }

    public static void main(String[] args) {
        int n;
        System.out.println(titling(4));
    }
}
