class Solution {
    public int reverseDegree(String s) {
        
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);    //fetching each character from string
            int x=('z'- ch) + 1;  //for assigning value a=26....z=1
            int y=i + 1;    //add index value
            sum+=(x*y); //for adding alphabet to index=product/sum

        }
        return sum;

    }
}