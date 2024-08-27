public class reversearray {

    public static void reverse(int num[]) {
        int start = 0, end = num.length - 1;
        while (start < end) {
           
            //swap
            int temp = num[end];
            num[end] = num[start];
            num[start] = temp;

            start++;
            end--;
        }
        
    }

    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4, 5, 6, 7 };
        reverse(num);

        for(int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
        System.out.println();
        
    }
}
