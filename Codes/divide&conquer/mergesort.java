
public class mergesort {

    public static void mergesorte(int arr[], int si, int ei) {

        // base case
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergesorte(arr, si, mid);
        mergesorte(arr, mid + 1, ei);
        merge(arr, si, ei, mid);
        
    }

    public static void merge(int arr[], int si, int ei, int mid) {

        int temp[] = new int[ei - si + 1];
        int i = si; // for left part
        int j = mid + 1; // for right part
        int k = 0; // for temp part array
    
        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
    
        // Copy remaining elements of left and right subarrays if any
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= ei) {
            temp[k] = arr[j];
            j++;
            k++;
        }
    
        // Copy elements from temp back to arr
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }
    

    public static void main(String[] args) {
        int arr[] = { 3, 2, 8, 9, 1, 2 };
        mergesorte(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
