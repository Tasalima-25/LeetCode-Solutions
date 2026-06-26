class Solution {
    public void rotate(int[] nums, int k) {

        int n=nums.length;  //stores length of array

        k=k%n;  //if k is greater than org array then only reminder takes rotation

        int[] temp=new int[n];

        for(int i=0;i<n;i++)
        {
            temp[(i+k)%n]=nums[i];  //stores ele at new position
        }

        for(int i=0;i<n;i++)
        {
            nums[i]=temp[i];    //moves rotated ele to org array
        }

    }
}