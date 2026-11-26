class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        int[] freq = new int[101];

        for (int i = 0; i < n; i++) {
            freq[nums[i] + 50]++;

            if (i >= k) {
                freq[nums[i - k] + 50]--;
            }

            if (i >= k - 1) {
                int count = 0;
                int beauty = 0;

                for (int v = -50; v < 0; v++) {
                    count += freq[v + 50];
                    if (count >= x) {
                        beauty = v;
                        break;
                    }
                }

                ans[i - k + 1] = beauty;
            }
        }

        return ans;
    }
}