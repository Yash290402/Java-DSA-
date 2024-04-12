
public class largest {

    public static int getlargest(int num[]) {
        int largest = Integer.MIN_VALUE; // denotes -infinity
        int smallest = Integer.MAX_VALUE; // denotes + infinity

        // largest value

        for (int i = 0; i < num.length; i++) {
            if (largest < num[i]) {
                largest = num[i];
            }
        }

        // smallest value

        for (int i = 0; i < num.length; i++) {
            if (smallest > num[i]) {
                smallest = num[i];
            }
        }
        System.out.println("smallest value is " + smallest);

        return largest;
    }

    public static void main(String[] args) {
        int num[] = { 26, 25, 98, 65, 65, 45 };
        System.out.println("largest num in array is " + getlargest(num));
    }
}
