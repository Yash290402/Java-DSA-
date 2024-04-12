import java.util.ArrayList;

public class Containwmw {

    // public static int conatinwater(ArrayList<Integer> height) {//o(n^2)
    // int maxwater = 0;

    // // brute froce
    // for (int i = 0; i < height.size(); i++) {
    // for (int j = 0; j < height.size(); j++) {
    // int ht = Math.min(height.get(i), height.get(j));
    // int wt = j - i;
    // int currwater = ht * wt;
    // maxwater = Math.max(maxwater, currwater);
    // }
    // }
    // return maxwater;
    // }

    // 2 pointer approch
    public static int storewater(ArrayList<Integer> height) {
        int maxwater = 0;
        int lp = 0;
        int Rp = height.size() - 1;

        // calculate area
        while (lp < Rp) { // o(n)
            int ht = Math.min(height.get(lp), height.get(Rp));
            int wt = Rp - lp;
            int currwater = ht * wt;
            maxwater = Math.max(maxwater, currwater);

            // update pointer
            if (height.get(lp) < height.get(Rp)) {
                lp++;
            } else {
                Rp--;
            }
        }
        return maxwater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<Integer>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        // System.out.println(conatinwater(height));
        System.out.println(storewater(height));
    }
}
