class Solution {
    public int largestAltitude(int[] gain) {

        int altitude = 0;   //starting altitude


        int maxAltitude = 0;    //highest altitude reached


        for (int i = 0; i < gain.length; i++) //traverse the gain array

        {

            altitude = altitude + gain[i]; //update current altitude


            if (altitude > maxAltitude)   //update highest altitude if needed

            {
                maxAltitude = altitude;
            }
        }

        return maxAltitude;
    }
}