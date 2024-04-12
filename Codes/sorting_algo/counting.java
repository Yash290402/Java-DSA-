public class counting {

    public static void count(int num[]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            largest = Math.max(largest, num[i]);

        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < count.length; i++) {
            count[num[i]]++;
        }

        // sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                num[j] = i;
                j++;
                count[i]--;

            }
        }

    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 5, 6, 7,5,4 };

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
