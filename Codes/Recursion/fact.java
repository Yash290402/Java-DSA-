
public class fact {

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int sum(int n) {
        if (n == 1) {

            return 1;
        }

        int sum1 = sum(n - 1);
        int sum2 = n + sum1;

        return sum2;
    }

    public static int fab(int n) { // o(2^n)
        if (n == 0 || n == 1) {
            return n;
        }
        return fab(n - 1) + fab(n - 2);
    }

    public static boolean Issorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return Issorted(arr, i + 1);
    }

    public static int firstOccurence(int[] arr, int i, int key) {

        if (i == arr.length - 1) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurence(arr, i + 1, key);
    }

    public static int lastOccurence(int[] arr, int i, int key) {
        if (i == arr.length) {
            return -1;
        }
        int islast = lastOccurence(arr, i + 1, key);
        if (islast == -1 && arr[i] == key) {
            return i;
        }
        return islast;
    }

    public static int power(int n, int x) {  //o(n)
        if (n == 0) {
            return 1;
        }

        return x * power(n - 1, x);
    }

    public static int optimizepower(int n, int x) {  //o(logn)
        if (n == 0) {
            return 1;
        }
        int optimized = optimizepower(n / 2, x) * optimizepower(n / 2, x);

        if (n %2 != 0) {
            optimized = x * optimizepower(n / 2, x);
        }
        return optimized;
    }

    public static void main(String[] args) {
        int n;
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 5 };
        // System.out.println(factorial(5));
        // System.out.println(sum(5));
        // System.out.println(fab(25));
        // System.out.println(Issorted(arr, 0));
        // System.out.println(firstOccurence(arr, 0, 5));
        // System.out.println(lastOccurence(arr, 0, 8));
        // System.out.println(power(4, 3));
        System.out.println(optimizepower(4, 3));
    }
}
