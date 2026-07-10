class Solution {
    public String addBinary(String a, String b) {

        int i = a.length() - 1;
        int j = b.length() - 1;

        int carry = 0;

        StringBuilder ans = new StringBuilder();

        while (i >= 0 || j >= 0 || carry != 0) {

            int sum = carry;

            //add digit from string a
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            //add digit from string b
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            //current binary digit
            ans.append(sum % 2);

            //update carry
            carry = sum / 2;
        }

        //reverse because digits were added from right to left
        return ans.reverse().toString();
    }
}