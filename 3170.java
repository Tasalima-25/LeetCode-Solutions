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