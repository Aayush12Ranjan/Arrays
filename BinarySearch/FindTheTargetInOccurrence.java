package BinarySearch;

public class FindTheTargetInOccurrence {

    static int Find(int arr[], int target) {
        int n = arr.length;
        int hi = n - 1;
        int lo = 0;
        int lb = -1;  // Initialize to -1 to indicate not found

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;  // Corrected mid calculation

            if (arr[mid] == target) {
                lb = mid;  // Found the target, but we need the first occurrence
                hi = mid - 1;  // Move left to find the first occurrence
            } else if (arr[mid] >= arr[lo]) {  // Left half is sorted
                if (target >= arr[lo] && target < arr[mid]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            } else {  // Right half is sorted
                if (target > arr[mid] && target <= arr[hi]) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }

        return lb;
    }

    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 6, 7, 7, 7, 0, 1, 2, 3, 4};
        int target = 7;
        int result = Find(arr, target);
        System.out.println("First occurrence of target " + target + " is at index: " + result);
    }
}
