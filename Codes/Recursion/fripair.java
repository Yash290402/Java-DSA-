public class fripair {
    public static int friendpair(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        // single
        int single = friendpair(n - 1);

        // pair
        int pair = friendpair(n - 2);
        int total = single + (n - 1) * pair;
        return total;
    }

    public static void main(String[] args) {
        int n;
        System.out.println(friendpair(3));
    }
}
