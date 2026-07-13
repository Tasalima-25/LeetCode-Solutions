class Solution {
    public String clearStars(String s) {

        StringBuilder str = new StringBuilder(s);

        while (true) {

            int star = str.indexOf("*");

            if (star == -1)
                break;

            int minIndex = -1;

            for (int i = 0; i < star; i++) {

                if (minIndex == -1 ||
                    str.charAt(i) < str.charAt(minIndex) ||
                    (str.charAt(i) == str.charAt(minIndex) && i > minIndex)) {

                    minIndex = i;
                }
            }

            str.deleteCharAt(minIndex);

            star--;

            str.deleteCharAt(star);
        }

        return str.toString();
    }
}

*********************** Optimal Approach **************************
class Solution {
    public String clearStars(String s) {

        // 26 stacks for a-z
        Stack<Integer>[] pos = new Stack[26];

        for (int i = 0; i < 26; i++) {
            pos[i] = new Stack<>();
        }

        // Marks characters that should be removed
        boolean[] removed = new boolean[s.length()];

        // Traverse the string
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '*') {

                // Remove the smallest character to the left
                for (int j = 0; j < 26; j++) {

                    if (!pos[j].isEmpty()) {

                        // Remove the rightmost occurrence
                        int index = pos[j].pop();

                        removed[index] = true;

                        break;
                    }
                }

            } else {

                // Store index of current character
                pos[ch - 'a'].push(i);
            }
        }

        // Build answer
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != '*' && !removed[i]) {
                ans.append(s.charAt(i));
            }
        }

        return ans.toString();
    }
}