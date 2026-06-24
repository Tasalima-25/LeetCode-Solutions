class Solution {
    public int missingNumber(int[] nums) {

        int n = nums.length;

        //sum of numbers from 0 to n
        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;

        //find actual sum
        for (int num : nums) {  
            actualSum += num;
        }

        //missing number
        return expectedSum - actualSum;
    }
}