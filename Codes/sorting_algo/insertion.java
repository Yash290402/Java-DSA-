public class insertion {

    public static void insertionsort(int num[]) {
        for (int i = 1; i < num.length - 1; i++) {
            int curr = num[i];
            int prev = i - 1;
            while (prev >= 0 && num[prev] > curr) {
                num[prev + 1] = num[prev];
                prev--;
            }

            // insertion
            num[prev + 1] = curr;
        }
    }

    public static void main(String[] args) {
        int num[] = { 5, 2, 3, 7, 9 };
        insertionsort(num);

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
