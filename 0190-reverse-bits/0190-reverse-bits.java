public class Solution {

    public int reverseBits(int n) {

        int result = 0;

        //process all 32 bits
        for (int i = 0; i < 32; i++) {

            //shift result to make space
            result <<= 1;

            //copy last bit of n
            result |= (n & 1);

            //move to next bit
            n >>>= 1;
        }

        return result;
    }
}