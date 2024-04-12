
public class oddoreven {
    public static void oddeven(int n) {
        int bitmask = 1;
        if ((n & bitmask) == 0) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }
    }

    public static void main(String[] args) {
        oddeven(14);
    }
}
