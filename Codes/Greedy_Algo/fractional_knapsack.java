
import java.util.*;
import java.util.Comparator;

public class fractional_knapsack {
    public static void main(String[] args) {
        int value[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int w = 50;

        // create 2D array for store the index and ratio
        double ratio[][] = new double[value.length][2];

        for (int i = 0; i < ratio.length; i++) {

            ratio[i][0] = i;
            ratio[i][1] = value[i] / (double) weight[i];

        }

        // sort in ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = w;
        int finalvalue = 0;

        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];

            if (capacity >= weight[idx]) {

                // include full item
                finalvalue += value[idx];
                capacity -= weight[idx];

            } else {
                // include fractional item

                finalvalue += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }

            System.out.println();
        }

        System.out.print("maximum profit is " + finalvalue);
    }

}
