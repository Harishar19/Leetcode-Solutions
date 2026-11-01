class Solution {
    public int trap(int[] height) {
        int i = 0;
		int j = height.length - 1;
		int left_max = 0, right_max = 0;
		int vol = 0;

		while (i < j) {
			if (height[i] < height[j]) {
				if (height[i] >= left_max) {
					left_max = height[i];

				} else {
					vol += left_max - height[i];
				}
				i++;

			}

			else {
				if (height[j] >= right_max) {
					right_max = height[j];
				} else {
					vol += right_max - height[j];
				}
				j--;
			}
		}
		return vol;
    }
}