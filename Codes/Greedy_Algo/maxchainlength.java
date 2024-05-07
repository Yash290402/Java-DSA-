import java.util.*;

public class maxchainlength {
    public static void main(String[] args) { // o(nlogn)

        int pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };

        // sort based on second number
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainLength = 1;
        int chainend = pairs[0][1]; // select the first pairs end

        for (int i = 1; i < pairs.length; i++) {

            if (pairs[i][0] > chainend) {
                chainLength++;
                chainend = pairs[i][1];
            }

        }

        System.out.println("Max chain length: " + chainLength);

    }
}
