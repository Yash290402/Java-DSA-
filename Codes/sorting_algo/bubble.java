public class bubble {

    public static void bubblesort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                // swap
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 2, 1, 9 };
        bubblesort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(""+arr[i]+"");
        }

    }
}