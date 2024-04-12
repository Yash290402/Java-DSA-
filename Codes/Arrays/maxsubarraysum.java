public class maxsubarraysum {
    // public static void maxsubarrsum(int num[]) {
    //     int curr = 0;
    //     int maxsum = Integer.MIN_VALUE;
    //     int prefix[] = new int[num.length];
    //     prefix[0] = num[0];

    //     // calculate the prefix array
    //     for (int i = 1; i < prefix.length; i++) {
    //         prefix[i] = prefix[i - 1] + num[i];
    //         System.out.println(prefix[i]);
    //     }
    //     System.out.println();

    //     for (int i = 0; i < num.length; i++) {
    //         int start = i;
    //         for (int j = i; j < num.length; j++) {
    //             int end = j;
    //             // curr = 0;
    //             // for (int k = start; k <= end; k++) {
    //             // curr += num[k]; // sum of subarrays
    //             // }

    //             curr = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

    //             System.out.println(curr);
    //             if (maxsum < curr) {
    //                 maxsum = curr;
    //             }

    //         }
    //         System.out.println();
    //     }
    //     System.out.println("max sum is: " + maxsum);
    // }

    public static void kadanes(int num[]) {


        // reduce time complexicity of algo 
        
        int cs = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            cs += num[i];
            if (cs < 0) {
                cs = 0;
            }
            maxsum = Math.max(maxsum, cs);
        }
        System.out.println("max sum is: " + maxsum);
    }

    public static void main(String[] args) {
        int num[] = { -2,-3,4,-1,-2,1,5,-3 };
        // maxsubarrsum(num);
        kadanes(num);
    }
}
