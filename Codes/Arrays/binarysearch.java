
public class binarysearch {

    public static int binarysch(int num[], int key) {
        int start = 0, end = num.length - 1;
       
        while (start <= end) {
            int mid = (start + end) / 2;
            if (num[mid] == key) {
                return mid;
            } else if (num[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int num[] = { 10, 20, 30, 40, 50, 60 };
        int key = 40;

        System.out.println("key is found at index:" + binarysch(num, key));

    }
}
