class Solution {
    public int removeDuplicates(int[] nums) {

        int i = 0;          // i points to the position of the last unique element


        for (int j = 1; j < nums.length; j++)      // j traverses the array from the second element

        {

            // If current element is different, then it is a new unique element
            if (nums[j] != nums[i])
            {
                i++;                        // Move i to the next position
                nums[i] = nums[j];         // Place the new unique element at index i

            }
        }

        return i + 1;        // Number of unique elements = last index + 1

    }
}