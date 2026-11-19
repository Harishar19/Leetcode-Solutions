class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int left = 0;
        int maxFreq = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            int rightIdx = s.charAt(right) - 'A';
            count[rightIdx]++;
            maxFreq = Math.max(maxFreq, count[rightIdx]);

            while ((right - left + 1) - maxFreq > k) {
                int leftIdx = s.charAt(left) - 'A';
                count[leftIdx]--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}