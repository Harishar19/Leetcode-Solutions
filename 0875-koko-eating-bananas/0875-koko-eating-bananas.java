class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = findMax(piles);
        int mid, res = 0;
        while(low <= high){
            mid = low + (high-low)/2;
            long minhrs = findhrs(piles, mid);

            if(minhrs <= h){
                res = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return res;
    }

    public static int findMax(int[] piles){
        int max = Integer.MIN_VALUE;
        for(int val : piles){
            if(val > max){
                max = val;
            }
        }
        return max;
    }

    public static long findhrs(int[] piles,int k) {
        long minhrs = 0;
        for(int idx = 0; idx< piles.length ; idx++ ) {
            minhrs += ((long) piles[idx] + k - 1) / k;
        }
        return minhrs;
    }
    
}