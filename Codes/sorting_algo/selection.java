public class selection {

    public static void selectionsort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minpo = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minpo] > arr[j]) {
                    minpo = j;
                }
            }
            // swap
            int temp = arr[minpo];
            arr[minpo] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 8, 2, 4, 3, 1 };
        selectionsort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");
        }
    }
}
