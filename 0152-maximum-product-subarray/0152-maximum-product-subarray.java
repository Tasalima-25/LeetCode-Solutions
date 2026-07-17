class Solution {
    public int maxProduct(int[] nums) {

        //initialize max product and min product
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int answer = nums[0];

        //traverse from second element
        for (int i = 1; i < nums.length; i++) {

            //if current number is negative, swap max and min
            if (nums[i] < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            //find maximum product ending at current index
            maxProduct = Math.max(nums[i], maxProduct * nums[i]);

            //find minimum product ending at current index
            minProduct = Math.min(nums[i], minProduct * nums[i]);

            //update answer
            answer = Math.max(answer, maxProduct);
        }

        return answer;
    }
}