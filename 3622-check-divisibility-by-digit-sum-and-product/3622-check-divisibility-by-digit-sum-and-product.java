class Solution {
    public boolean checkDivisibility(int n) {

        int temp = n;
        int sum = 0;
        int product = 1;

        while (temp > 0) {

            // Get last digit
            int digit = temp % 10;

            // Add digit to sum
            sum += digit;

            // Multiply digit
            product *= digit;

            // Remove last digit
            temp = temp / 10;
        }

        // Check divisibility
        return n % (sum + product) == 0;
    }
}