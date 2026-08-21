class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maximumSum = nums[0];
	    int maxsum = maximumSum;
	    
	    int minimunsum = nums[0];
	    int minsum = maximumSum;
	    int total = nums[0];
	    for(int i=1; i<nums.length;i++){
	        total += nums[i];
	        maximumSum = Math.max(maximumSum + nums[i], nums[i]);
	        maxsum = Math.max(maxsum, maximumSum);
	        
	       minimunsum = Math.min(minimunsum + nums[i], nums[i]);
	       minsum = Math.min(minsum,minimunsum);
	       
	
	        
	    }
        if(maxsum < 0){
	           return maxsum;
	    }
	    return Math.max(maxsum, (total - minsum));
        
    }
}