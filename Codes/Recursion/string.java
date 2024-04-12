public class string {

    public static void printbinstring(int n, int lastplace, String str) {

        if (n == 0) {
            System.out.println(str);
            return;
        }

        printbinstring(n - 1, 0, str + "0");
        if (lastplace == 0) {
            printbinstring(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {

        printbinstring(3, 0, "");
    }
}
