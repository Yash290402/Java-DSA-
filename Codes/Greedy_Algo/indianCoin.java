import java.util.*;

public class indianCoin {
    public static void main(String[] args) {

        Integer coin[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };

        Arrays.sort(coin, Comparator.reverseOrder());

        ArrayList<Integer> ans = new ArrayList<>();

        int count = 0;
        int amount = 590;

        for (int i = 0; i < coin.length; i++) {

            if (coin[i] <= amount) {

                while (coin[i] <= amount) {

                    count++;
                    ans.add(coin[i]);
                    amount -= coin[i];

                }
            }
        }

        System.out.println("Minimum coins required: " + count);

        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i) + "");
        }
    }
}
