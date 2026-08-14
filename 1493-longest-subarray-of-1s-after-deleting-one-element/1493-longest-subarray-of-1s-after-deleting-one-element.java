class Solution {
    public int longestSubarray(int[] nums) {
        int i = 0, count =0, zeroCnt=0, lngLen=0;
        for(int j =0; j<nums.length;j++) {

            if (nums[j] == 0) {
                zeroCnt++;
            }
            while (zeroCnt > 1) {
                if (nums[i] == 0) {
                    zeroCnt--;
                }
                i++;
            }
            lngLen = Math.max(lngLen, j-i);
        }
        return lngLen;
        
    }
}