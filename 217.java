import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {

        // Create a HashSet to store unique elements
        HashSet<Integer> set = new HashSet<>();

        // Traverse the array
        for (int num : nums) {

            // If element already exists, duplicate found
            if (set.contains(num)) {
                return true;
            }

            // Otherwise add it to the set
            set.add(num);
        }

        // No duplicates found
        return false;
    }
}