class Solution {
    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            //find middle index
            int mid = left + (right - left) / 2;

            //target found
            if (nums[mid] == target) {
                return mid;
            }

            //search left half
            else if (target < nums[mid]) {
                right = mid - 1;
            }

            //search right half
            else {
                left = mid + 1;
            }
        }

        //target not found
        return -1;
    }
}