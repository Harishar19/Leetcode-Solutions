class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return -1;
        }

        int low = 0;
        int high = nums.length-1;
        int answer = -1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                answer = mid;
                low = mid + 1;
            }
            else {

                high = mid - 1;
            }
        }
        return answer + 1;
    }
    
}