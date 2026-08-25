class Solution {
    public int missingMultiple(int[] nums, int k) {

        boolean[] seen = new boolean[101];

        // Store numbers
        for (int num : nums) {
            seen[num] = true;
        }

        // Check multiples of k
        for (int i = 1; ; i++) {

            int multiple = k * i;

            if (multiple > 100 || !seen[multiple]) {
                return multiple;
            }
        }
    }
}