class Solution {

    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {

        int sum = 0;

        //traverse indices
        for (int i = 0; i < nums.size(); i++) {

            int count = 0;
            int temp = i;

            //count set bits in the index
            while (temp > 0) {

                if ((temp & 1) == 1) {
                    count++;
                }

                temp = temp >> 1;
            }

            //index having k bits
            if (count == k) {
                sum += nums.get(i);
            }
        }

        return sum;
    }
}