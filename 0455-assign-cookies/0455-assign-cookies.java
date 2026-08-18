class Solution {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0;  // child
        int j = 0;  // cookie
        int count = 0;

        while (i < g.length && j < s.length) {

            // Cookie child ki greed satisfy kar sakti hai
            if (s[j] >= g[i]) {
                count++;
                i++;  // next child
            }

            // Next cookie try karo
            j++;
        }

        return count;
    }
}