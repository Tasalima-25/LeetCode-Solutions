class Solution {
    public String convertDateToBinary(String date) {

        String[] arr=date.split("-");
        for(int i=0;i<arr.length;i++)
        {
            int n=Integer.parseInt(arr[i]); //convert string to integer
            arr[i]=Integer.toBinaryString(n);   //convert integer to binary string
        }
        return String.join("-",arr);
        
    }
}