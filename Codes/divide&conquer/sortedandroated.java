public class sortedandroated {
    

        // Function to perform binary search on sorted and rotated array
        public static int search(int arr[], int target) {
            int low = 0;
            int high = arr.length - 1;
    
            while (low <= high) {
                int mid = low + (high - low) / 2;
    
                if (arr[mid] == target)
                    return mid;
    
                // If the left half of the array is sorted
                if (arr[low] <= arr[mid]) {
                    // If the target lies in the left half
                    if (target >= arr[low] && target < arr[mid])
                        high = mid - 1;
                    else
                        low = mid + 1;
                }
                // If the right half of the array is sorted
                else {
                    // If the target lies in the right half
                    if (target > arr[mid] && target <= arr[high])
                        low = mid + 1;
                    else
                        high = mid - 1;
                }
            }
            // If the target is not found in the array
            return -1;
        }
    
        // Main method to test the search function
        public static void main(String[] args) {
            int arr[] = {4, 5, 6, 7, 8, 9, 1, 2, 3};
            int target = 6;
            int index = search(arr, target);
            if (index != -1)
                System.out.println("Element found at index " + index);
            else
                System.out.println("Element not found");
        }
    }
    

