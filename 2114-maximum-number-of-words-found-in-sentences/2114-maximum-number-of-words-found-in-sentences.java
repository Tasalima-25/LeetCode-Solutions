class Solution {
    public int mostWordsFound(String[] sentences) {

        int maxWords = 0;

        // Traverse all sentences
        for (String sentence : sentences) {

            int words = 1; // Every sentence has at least one word

            // Count spaces
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' ') {
                    words++;
                }
            }

            // Update maximum
            maxWords = Math.max(maxWords, words);
        }

        return maxWords;
    }
}