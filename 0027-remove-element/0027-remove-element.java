class Solution {
    public int removeElement(int[] nums, int val) {

        int k = 0;

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {

            // Keep only elements not equal to val
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}