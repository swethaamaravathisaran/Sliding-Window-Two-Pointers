public class MaxSumSubarray {
    public static int maxSumSubarray(int[] arr, int k) {
        int n = arr.length;
        if (n < k) {
            return -1; // Edge case: Window size is larger than array size
        }

        // Step 1: Compute sum of first k elements
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        
        int maxSum = sum;

        // Step 2: Slide the window from left to right
        for (int l = 0, r = k; r < n; l++, r++) {
            sum = sum - arr[l] + arr[r]; // Remove leftmost, add new rightmost element
            maxSum = Math.max(maxSum, sum); // Update max sum if needed
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 2, 3, 4, 5, -1};
        int k = 4;
        System.out.println("Maximum sum of subarray of size " + k + " is: " + maxSumSubarray(arr, k));
    }
}
