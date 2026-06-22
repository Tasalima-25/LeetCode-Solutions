class Solution {
    public void moveZeroes(int[] nums) {

        int j = 0;        //non zero element placed

        for (int i = 0; i < nums.length; i++)   //array traversal
        {

            if (nums[i] != 0)   // If current element is non-zero

            {

                // Swap nums[i] and nums[j]
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                j++;      //move j to next position

            }
        }
    }
}