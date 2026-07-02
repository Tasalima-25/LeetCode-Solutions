class Solution {
    public int reverse(int x) {

        int rev = 0;

        while (x != 0) {

            // Take the last digit
            int digit = x % 10;

            // Check overflow
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }

            // Add digit to reversed number
            rev = rev * 10 + digit;

            // Remove the last digit
            x = x / 10;
        }

        return rev;
    }
}