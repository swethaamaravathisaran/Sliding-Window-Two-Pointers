public class LongestSubarraySum {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 10, 10};
        int k = 14;

        int l = 0, r = 0;
        int sum = 0;
        int maxLen = 0;

        while (r < arr.length) {
            sum += arr[r]; // Add the current element to sum

            // Shrink the window from the left if sum exceeds k
            while (sum > k) {
                sum -= arr[l];
                l++;
            }

            // Update maxLen if sum is within the limit
            if (sum <= k) {
                maxLen = Math.max(maxLen, r - l + 1);
            }

            r++; // Expand the window
        }

        System.out.println(maxLen); // Print the maximum length of the subarray
    }
}
