class Solution {
    public String reverseWords(String s) {

        StringBuilder ans = new StringBuilder();

        int i = s.length() - 1;

        while (i >= 0) {

            // Skip spaces
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            if (i < 0) {
                break;
            }

            // Find the start of the word
            int j = i;

            while (j >= 0 && s.charAt(j) != ' ') {
                j--;
            }

            // Add the word
            if (ans.length() > 0) {
                ans.append(" ");
            }

            for (int k = j + 1; k <= i; k++) {
                ans.append(s.charAt(k));
            }

            // Move to the previous word
            i = j;
        }

        return ans.toString();
    }
}