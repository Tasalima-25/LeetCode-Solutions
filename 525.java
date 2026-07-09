class Solution {
    public int findMaxLength(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Sum 0 is seen before array starts
        map.put(0, -1);

        int sum = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {

            // Convert 0 to -1
            if (nums[i] == 0)
                sum--;
            else
                sum++;

            // Sum already seen
            if (map.containsKey(sum)) {

                max = Math.max(max, i - map.get(sum));

            } else {

                // Store first occurrence
                map.put(sum, i);
            }
        }

        return max;
    }
}