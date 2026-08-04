class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        List<Integer> result = new ArrayList<>();

        HashSet<Integer> set = new HashSet<>();

        int min = nums[0];
        int max = nums[0];

        // Store all numbers in HashSet
        for (int num : nums) {
            set.add(num);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        // Find missing numbers
        for (int i = min; i <= max; i++) {
            if (!set.contains(i)) {
                result.add(i);
            }
        }

        return result;
    }
}