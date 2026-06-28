class Solution {
    public void reverseString(char[] s) {

        // Left pointer starts from the beginning
        int left = 0;

        // Right pointer starts from the end
        int right = s.length - 1;

        // Continue until both pointers meet
        while (left < right) {

            // Swap characters
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            // Move pointers
            left++;
            right--;
        }
    }
}