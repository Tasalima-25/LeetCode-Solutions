class Solution {
    public int countPrimes(int n) {

        if (n <= 2) {
            return 0;
        }

        // true means number is prime
        boolean[] prime = new boolean[n];

        // Initially assume all numbers are prime
        for (int i = 2; i < n; i++) {
            prime[i] = true;
        }

        // Remove multiples of each prime number
        for (int i = 2; i * i < n; i++) {

            if (prime[i]) {

                // Start from i*i
                for (int j = i * i; j < n; j += i) {
                    prime[j] = false;
                }
            }
        }

        // Count remaining prime numbers
        int count = 0;

        for (int i = 2; i < n; i++) {

            if (prime[i]) {
                count++;
            }
        }

        return count;
    }
}