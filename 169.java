class Solution {
    public int majorityElement(int[] nums) {

        int element = 0;
        int count = 0;

        for (int num : nums) {

            // Choose a new elemen
            if (count == 0) {
                element = num;
            }

            // Increase or decrease count
            if (num == element) {
                count++;
            } else {
                count--;
            }
        }

        return element;
    }
}