

//Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

public class pra4 {
    public static int trappedrainwater(int height[]) {  //o(n)
        int n = height.length;

        // calculate left max boundary--array
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }

        // calculate right max boundary--array
        int rightmax[] = new int[n];
        rightmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }

        // loop
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            // min of left and right
            int waterlevel = Math.min(leftmax[i], rightmax[i]);

            //trapped water is waterlevel-height
            trappedWater += waterlevel-height[i];
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int num[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(trappedrainwater(num));
    }
}
