import java.util.*;;

public class chocola {
    public static void main(String[] args) {
        int n = 3, m = 4;

        Integer horizontal[] = { 2, 1, 3, 1, 4 };
        Integer vertical[] = { 4, 1, 2 };

        Arrays.sort(horizontal, Collections.reverseOrder());
        Arrays.sort(vertical, Collections.reverseOrder());

        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;

        while (h < horizontal.length && v < vertical.length) {

            if (vertical[v] <= horizontal[h]) { 
                // horizontal cut
                cost += (horizontal[h] * vp);
                hp++;
                h++;
            } else {
                // vertical cut
                cost += (vertical[v] * hp);
                vp++;
                v++;

            }
        }

        while (h < horizontal.length) {
            cost += (horizontal[h] * vp);
            hp++;
            h++;
        }

        while (v < vertical.length) {
            cost += (vertical[v] * hp);
            vp++;
            v++;
        }

        System.out.println("min cost is:" + cost);
    }
}
