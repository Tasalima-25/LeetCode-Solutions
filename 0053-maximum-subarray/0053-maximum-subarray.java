class Solution {
    public int maxSubArray(int[] nums) {

        // Store the maximum sum found
        int maxSum = nums[0];

        // Store the current subarray sum
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {

            //add current element to the running sum
            currentSum += nums[i];

            // Update maxSum if currentSum is greater
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            // If currentSum becomes negative,
            // start a new subarray from the next element
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        // Return the maximum subarray sum
        return maxSum;
    }
}