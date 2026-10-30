class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int sum= 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            sum = 0;
            while (j < k) {
                sum = nums[i] + nums[j] + nums[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                   List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(nums[k]);
                    list.add(triplet);
                    j++; k--;

                    while(j< k && nums[j] == nums[j-1]){
                        j++;
                    }
                    
                    while(j < k && nums[k] == nums[k+1]){
                        k--;
                    }
                    
                }
            }

        }
        return list;
    }
}