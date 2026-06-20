class Solution {
    public int strStr(String leetcode, String leeto) {

        // Check every possible starting position
        for (int i = 0; i <= leetcode.length() - leeto.length(); i++) {

            // Compare substring with needle
            if (leetcode.substring(i, i + leeto.length()).equals(leeto)) {
                return i;
            }
        }

        // Not found
        return -1;
    }
}